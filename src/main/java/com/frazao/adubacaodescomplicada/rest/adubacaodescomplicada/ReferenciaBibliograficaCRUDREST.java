package com.frazao.adubacaodescomplicada.rest.adubacaodescomplicada;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.frazao.adubacaodescomplicada.bo.adubacaodescomplicada.ReferenciaBibliograficaBO;
import com.frazao.adubacaodescomplicada.modelo.dto.adubacaodescomplicada.ReferenciaBibliograficaFiltroDTO;
import com.frazao.adubacaodescomplicada.modelo.entidade.adubacaodescomplicada.ReferenciaBibliografica;
import com.frazao.adubacaodescomplicada.rest.CRUDREST;

@RestController
@RequestMapping(value = "referencia-bibliografica")
public class ReferenciaBibliograficaCRUDREST extends CRUDREST<ReferenciaBibliografica, java.lang.Integer, ReferenciaBibliograficaFiltroDTO, ReferenciaBibliograficaBO> {

   public ReferenciaBibliograficaCRUDREST(@Autowired ReferenciaBibliograficaBO bo) {
      super(bo);
   }

   public ReferenciaBibliograficaBO getBO() {
	  return super.getBO();
   }

	@Override
	public ReferenciaBibliografica prepararForm(ReferenciaBibliografica modelo, Principal usuario) throws Exception {
		return modelo == null ? new ReferenciaBibliografica() : modelo;
	}

}
