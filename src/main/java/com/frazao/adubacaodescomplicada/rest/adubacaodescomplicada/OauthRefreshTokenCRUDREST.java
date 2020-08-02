package com.frazao.adubacaodescomplicada.rest.adubacaodescomplicada;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.frazao.adubacaodescomplicada.rest.CRUDREST;
import com.frazao.adubacaodescomplicada.modelo.entidade.adubacaodescomplicada.OauthRefreshToken;
import com.frazao.adubacaodescomplicada.bo.adubacaodescomplicada.OauthRefreshTokenBO;
import com.frazao.adubacaodescomplicada.modelo.dto.adubacaodescomplicada.OauthRefreshTokenFiltroDTO;

@RestController
@RequestMapping(value = "oauth-refresh-token")
public class OauthRefreshTokenCRUDREST extends CRUDREST<OauthRefreshToken, Integer, OauthRefreshTokenFiltroDTO, OauthRefreshTokenBO> {

   public OauthRefreshTokenCRUDREST(@Autowired OauthRefreshTokenBO bo) {
      super(bo);
   }

   public OauthRefreshTokenBO getBO() {
	  return super.getBO();
   }

	@Override
	public OauthRefreshToken prepararForm(OauthRefreshToken modelo) throws Exception {
		return modelo == null ? new OauthRefreshToken() : modelo;
	}

}
