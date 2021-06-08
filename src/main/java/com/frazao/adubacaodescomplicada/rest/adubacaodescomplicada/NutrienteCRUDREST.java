package com.frazao.adubacaodescomplicada.rest.adubacaodescomplicada;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.frazao.adubacaodescomplicada.bo.adubacaodescomplicada.NutrienteBO;
import com.frazao.adubacaodescomplicada.modelo.dto.adubacaodescomplicada.NutrienteFiltroDTO;
import com.frazao.adubacaodescomplicada.modelo.entidade.adubacaodescomplicada.Nutriente;
import com.frazao.adubacaodescomplicada.rest.CRUDREST;

@RestController
@RequestMapping(value = "nutriente")
public class NutrienteCRUDREST extends CRUDREST<Nutriente, java.lang.Integer, NutrienteFiltroDTO, NutrienteBO> {

   public NutrienteCRUDREST(@Autowired NutrienteBO bo) {
      super(bo);
   }

   public NutrienteBO getBO() {
	  return super.getBO();
   }

	@Override
	public Nutriente prepararForm(Nutriente modelo, Principal usuario) throws Exception {
		return modelo == null ? new Nutriente() : modelo;
	}

}
