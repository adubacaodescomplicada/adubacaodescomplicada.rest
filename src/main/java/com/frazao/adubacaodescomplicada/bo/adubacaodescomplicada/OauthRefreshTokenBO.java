package com.frazao.adubacaodescomplicada.bo.adubacaodescomplicada;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frazao.adubacaodescomplicada.bo.CRUDBO;
import com.frazao.adubacaodescomplicada.dao.adubacaodescomplicada.OauthRefreshTokenDAO;
import com.frazao.adubacaodescomplicada.modelo.dto.adubacaodescomplicada.OauthRefreshTokenFiltroDTO;
import com.frazao.adubacaodescomplicada.modelo.entidade.adubacaodescomplicada.OauthRefreshToken;

@Service
public class OauthRefreshTokenBO extends CRUDBO<OauthRefreshToken, Integer, OauthRefreshTokenFiltroDTO, OauthRefreshTokenDAO> {

   public OauthRefreshTokenBO(@Autowired OauthRefreshTokenDAO dao) {
      super(OauthRefreshToken.class, dao);
   }

}

