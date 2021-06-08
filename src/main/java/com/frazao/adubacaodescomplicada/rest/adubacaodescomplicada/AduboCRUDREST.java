package com.frazao.adubacaodescomplicada.rest.adubacaodescomplicada;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.frazao.adubacaodescomplicada.rest.CRUDREST;
import com.frazao.adubacaodescomplicada.modelo.entidade.adubacaodescomplicada.Adubo;
import com.frazao.adubacaodescomplicada.bo.adubacaodescomplicada.AduboBO;
import com.frazao.adubacaodescomplicada.modelo.dto.adubacaodescomplicada.AduboFiltroDTO;

@RestController
@RequestMapping(value = "adubo")
public class AduboCRUDREST extends CRUDREST<Adubo, java.lang.Integer, AduboFiltroDTO, AduboBO> {

   public AduboCRUDREST(@Autowired AduboBO bo) {
      super(bo);
   }

   public AduboBO getBO() {
	  return super.getBO();
   }

	@Override
	public Adubo prepararForm(Adubo modelo, Principal usuario) throws Exception {
		return modelo == null ? new Adubo() : modelo;
	}

}
