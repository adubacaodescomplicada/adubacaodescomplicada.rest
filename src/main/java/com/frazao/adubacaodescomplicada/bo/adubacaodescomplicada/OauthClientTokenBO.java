package com.frazao.adubacaodescomplicada.bo.adubacaodescomplicada;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frazao.adubacaodescomplicada.bo.CRUDBO;
import com.frazao.adubacaodescomplicada.dao.adubacaodescomplicada.OauthClientTokenDAO;
import com.frazao.adubacaodescomplicada.modelo.dto.adubacaodescomplicada.OauthClientTokenFiltroDTO;
import com.frazao.adubacaodescomplicada.modelo.entidade.adubacaodescomplicada.OauthClientToken;

@Service
public class OauthClientTokenBO extends CRUDBO<OauthClientToken, java.lang.Integer, OauthClientTokenFiltroDTO, OauthClientTokenDAO> {

   public OauthClientTokenBO(@Autowired OauthClientTokenDAO dao) {
      super(OauthClientToken.class, dao);
   }


   public OauthClientTokenDAO getDAO() {
	  return (OauthClientTokenDAO) super.getDAO();
   }

}

