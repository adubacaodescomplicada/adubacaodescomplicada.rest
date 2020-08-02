package com.frazao.adubacaodescomplicada.rest.adubacaodescomplicada;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.frazao.adubacaodescomplicada.rest.CRUDREST;
import com.frazao.adubacaodescomplicada.modelo.entidade.adubacaodescomplicada.OauthAccessToken;
import com.frazao.adubacaodescomplicada.bo.adubacaodescomplicada.OauthAccessTokenBO;
import com.frazao.adubacaodescomplicada.modelo.dto.adubacaodescomplicada.OauthAccessTokenFiltroDTO;

@RestController
@RequestMapping(value = "oauth-access-token")
public class OauthAccessTokenCRUDREST extends CRUDREST<OauthAccessToken, java.lang.Integer, OauthAccessTokenFiltroDTO, OauthAccessTokenBO> {

   public OauthAccessTokenCRUDREST(@Autowired OauthAccessTokenBO bo) {
      super(bo);
   }

   public OauthAccessTokenBO getBO() {
	  return super.getBO();
   }

	@Override
	public OauthAccessToken prepararForm(OauthAccessToken modelo) throws Exception {
		return modelo == null ? new OauthAccessToken() : modelo;
	}

}
