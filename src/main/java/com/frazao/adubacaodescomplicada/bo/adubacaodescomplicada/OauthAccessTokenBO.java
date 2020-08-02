package com.frazao.adubacaodescomplicada.bo.adubacaodescomplicada;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frazao.adubacaodescomplicada.bo.CRUDBO;
import com.frazao.adubacaodescomplicada.dao.adubacaodescomplicada.OauthAccessTokenDAO;
import com.frazao.adubacaodescomplicada.modelo.dto.adubacaodescomplicada.OauthAccessTokenFiltroDTO;
import com.frazao.adubacaodescomplicada.modelo.entidade.adubacaodescomplicada.OauthAccessToken;

@Service
public class OauthAccessTokenBO extends CRUDBO<OauthAccessToken, java.lang.Integer, OauthAccessTokenFiltroDTO, OauthAccessTokenDAO> {

   public OauthAccessTokenBO(@Autowired OauthAccessTokenDAO dao) {
      super(OauthAccessToken.class, dao);
   }

}

