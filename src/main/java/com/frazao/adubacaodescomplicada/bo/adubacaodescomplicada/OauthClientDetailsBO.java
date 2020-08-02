package com.frazao.adubacaodescomplicada.bo.adubacaodescomplicada;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frazao.adubacaodescomplicada.bo.CRUDBO;
import com.frazao.adubacaodescomplicada.dao.adubacaodescomplicada.OauthClientDetailsDAO;
import com.frazao.adubacaodescomplicada.modelo.dto.adubacaodescomplicada.OauthClientDetailsFiltroDTO;
import com.frazao.adubacaodescomplicada.modelo.entidade.adubacaodescomplicada.OauthClientDetails;

@Service
public class OauthClientDetailsBO extends CRUDBO<OauthClientDetails, java.lang.Integer, OauthClientDetailsFiltroDTO, OauthClientDetailsDAO> {

   public OauthClientDetailsBO(@Autowired OauthClientDetailsDAO dao) {
      super(OauthClientDetails.class, dao);
   }

}

