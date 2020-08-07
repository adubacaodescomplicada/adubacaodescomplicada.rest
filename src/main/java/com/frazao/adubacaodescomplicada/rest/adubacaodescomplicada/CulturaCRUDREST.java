package com.frazao.adubacaodescomplicada.rest.adubacaodescomplicada;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.frazao.adubacaodescomplicada.bo.adubacaodescomplicada.CulturaBO;
import com.frazao.adubacaodescomplicada.modelo.dto.adubacaodescomplicada.CulturaFiltroDTO;
import com.frazao.adubacaodescomplicada.modelo.entidade.adubacaodescomplicada.Cultura;
import com.frazao.adubacaodescomplicada.rest.CRUDREST;

@RestController
@RequestMapping(value = "cultura")
public class CulturaCRUDREST extends CRUDREST<Cultura, java.lang.Integer, CulturaFiltroDTO, CulturaBO> {

   public CulturaCRUDREST(@Autowired CulturaBO bo) {
      super(bo);
   }

   public CulturaBO getBO() {
	  return super.getBO();
   }

	@Override
	public Cultura prepararForm(Cultura modelo) throws Exception {
		return modelo == null ? new Cultura() : modelo;
	}

}
