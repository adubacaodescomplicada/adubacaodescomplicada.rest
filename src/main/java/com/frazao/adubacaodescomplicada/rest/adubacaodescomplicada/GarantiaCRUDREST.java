package com.frazao.adubacaodescomplicada.rest.adubacaodescomplicada;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.frazao.adubacaodescomplicada.rest.CRUDREST;
import com.frazao.adubacaodescomplicada.modelo.entidade.adubacaodescomplicada.Garantia;
import com.frazao.adubacaodescomplicada.bo.adubacaodescomplicada.GarantiaBO;
import com.frazao.adubacaodescomplicada.modelo.dto.adubacaodescomplicada.GarantiaFiltroDTO;

@RestController
@RequestMapping(value = "garantia")
public class GarantiaCRUDREST extends CRUDREST<Garantia, java.lang.Integer, GarantiaFiltroDTO, GarantiaBO> {

   public GarantiaCRUDREST(@Autowired GarantiaBO bo) {
      super(bo);
   }

   public GarantiaBO getBO() {
	  return super.getBO();
   }

	@Override
	public Garantia prepararForm(Garantia modelo, Principal usuario) throws Exception {
		return modelo == null ? new Garantia() : modelo;
	}

}
