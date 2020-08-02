package com.frazao.adubacaodescomplicada.rest.adubacaodescomplicada;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.frazao.adubacaodescomplicada.rest.CRUDREST;
import com.frazao.adubacaodescomplicada.modelo.entidade.adubacaodescomplicada.OauthClientToken;
import com.frazao.adubacaodescomplicada.bo.adubacaodescomplicada.OauthClientTokenBO;
import com.frazao.adubacaodescomplicada.modelo.dto.adubacaodescomplicada.OauthClientTokenFiltroDTO;

@RestController
@RequestMapping(value = "oauth-client-token")
public class OauthClientTokenCRUDREST extends CRUDREST<OauthClientToken, java.lang.Integer, OauthClientTokenFiltroDTO, OauthClientTokenBO> {

   public OauthClientTokenCRUDREST(@Autowired OauthClientTokenBO bo) {
      super(bo);
   }

   public OauthClientTokenBO getBO() {
	  return super.getBO();
   }

	@Override
	public OauthClientToken prepararForm(OauthClientToken modelo) throws Exception {
		return modelo == null ? new OauthClientToken() : modelo;
	}

}
