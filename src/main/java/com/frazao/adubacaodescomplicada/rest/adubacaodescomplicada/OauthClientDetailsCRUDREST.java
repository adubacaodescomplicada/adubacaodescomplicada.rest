package com.frazao.adubacaodescomplicada.rest.adubacaodescomplicada;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.frazao.adubacaodescomplicada.rest.CRUDREST;
import com.frazao.adubacaodescomplicada.modelo.entidade.adubacaodescomplicada.OauthClientDetails;
import com.frazao.adubacaodescomplicada.bo.adubacaodescomplicada.OauthClientDetailsBO;
import com.frazao.adubacaodescomplicada.modelo.dto.adubacaodescomplicada.OauthClientDetailsFiltroDTO;

@RestController
@RequestMapping(value = "oauth-client-details")
public class OauthClientDetailsCRUDREST extends CRUDREST<OauthClientDetails, java.lang.Integer, OauthClientDetailsFiltroDTO, OauthClientDetailsBO> {

   public OauthClientDetailsCRUDREST(@Autowired OauthClientDetailsBO bo) {
      super(bo);
   }

   public OauthClientDetailsBO getBO() {
	  return super.getBO();
   }

	@Override
	public OauthClientDetails prepararForm(OauthClientDetails modelo) throws Exception {
		return modelo == null ? new OauthClientDetails() : modelo;
	}

}
