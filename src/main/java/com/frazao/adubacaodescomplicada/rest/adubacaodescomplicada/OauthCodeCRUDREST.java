package com.frazao.adubacaodescomplicada.rest.adubacaodescomplicada;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.frazao.adubacaodescomplicada.rest.CRUDREST;
import com.frazao.adubacaodescomplicada.modelo.entidade.adubacaodescomplicada.OauthCode;
import com.frazao.adubacaodescomplicada.bo.adubacaodescomplicada.OauthCodeBO;
import com.frazao.adubacaodescomplicada.modelo.dto.adubacaodescomplicada.OauthCodeFiltroDTO;

@RestController
@RequestMapping(value = "oauth-code")
public class OauthCodeCRUDREST extends CRUDREST<OauthCode, Integer, OauthCodeFiltroDTO, OauthCodeBO> {

   public OauthCodeCRUDREST(@Autowired OauthCodeBO bo) {
      super(bo);
   }

   public OauthCodeBO getBO() {
	  return super.getBO();
   }

	@Override
	public OauthCode prepararForm(OauthCode modelo) throws Exception {
		return modelo == null ? new OauthCode() : modelo;
	}

}
