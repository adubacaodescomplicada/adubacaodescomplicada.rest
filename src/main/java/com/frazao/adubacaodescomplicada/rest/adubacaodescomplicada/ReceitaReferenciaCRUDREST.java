package com.frazao.adubacaodescomplicada.rest.adubacaodescomplicada;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.frazao.adubacaodescomplicada.bo.adubacaodescomplicada.ReceitaReferenciaBO;
import com.frazao.adubacaodescomplicada.modelo.dto.adubacaodescomplicada.ReceitaReferenciaFiltroDTO;
import com.frazao.adubacaodescomplicada.modelo.entidade.adubacaodescomplicada.ReceitaReferencia;
import com.frazao.adubacaodescomplicada.rest.CRUDREST;

@RestController
@RequestMapping(value = "receita-referencia")
public class ReceitaReferenciaCRUDREST extends CRUDREST<ReceitaReferencia, java.lang.Integer, ReceitaReferenciaFiltroDTO, ReceitaReferenciaBO> {

   public ReceitaReferenciaCRUDREST(@Autowired ReceitaReferenciaBO bo) {
      super(bo);
   }

   public ReceitaReferenciaBO getBO() {
	  return super.getBO();
   }

	@Override
	public ReceitaReferencia prepararForm(ReceitaReferencia modelo, Principal usuario) throws Exception {
		return modelo == null ? new ReceitaReferencia() : modelo;
	}

}
