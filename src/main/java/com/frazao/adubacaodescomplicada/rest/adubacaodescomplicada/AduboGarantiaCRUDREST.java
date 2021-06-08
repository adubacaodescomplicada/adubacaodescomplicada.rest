package com.frazao.adubacaodescomplicada.rest.adubacaodescomplicada;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.frazao.adubacaodescomplicada.rest.CRUDREST;
import com.frazao.adubacaodescomplicada.modelo.entidade.adubacaodescomplicada.AduboGarantia;
import com.frazao.adubacaodescomplicada.bo.adubacaodescomplicada.AduboGarantiaBO;
import com.frazao.adubacaodescomplicada.modelo.dto.adubacaodescomplicada.AduboGarantiaFiltroDTO;

@RestController
@RequestMapping(value = "adubo-garantia")
public class AduboGarantiaCRUDREST extends CRUDREST<AduboGarantia, java.lang.Integer, AduboGarantiaFiltroDTO, AduboGarantiaBO> {

   public AduboGarantiaCRUDREST(@Autowired AduboGarantiaBO bo) {
      super(bo);
   }

   public AduboGarantiaBO getBO() {
	  return super.getBO();
   }

	@Override
	public AduboGarantia prepararForm(AduboGarantia modelo, Principal usuario) throws Exception {
		return modelo == null ? new AduboGarantia() : modelo;
	}

}
