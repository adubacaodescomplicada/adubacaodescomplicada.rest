package com.frazao.adubacaodescomplicada.rest.adubacaodescomplicada;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.frazao.adubacaodescomplicada.rest.CRUDREST;
import com.frazao.adubacaodescomplicada.modelo.entidade.adubacaodescomplicada.UnidadeMedida;
import com.frazao.adubacaodescomplicada.bo.adubacaodescomplicada.UnidadeMedidaBO;
import com.frazao.adubacaodescomplicada.modelo.dto.adubacaodescomplicada.UnidadeMedidaFiltroDTO;

@RestController
@RequestMapping(value = "unidade-medida")
public class UnidadeMedidaCRUDREST extends CRUDREST<UnidadeMedida, java.lang.Integer, UnidadeMedidaFiltroDTO, UnidadeMedidaBO> {

   public UnidadeMedidaCRUDREST(@Autowired UnidadeMedidaBO bo) {
      super(bo);
   }

   public UnidadeMedidaBO getBO() {
	  return super.getBO();
   }

	@Override
	public UnidadeMedida prepararForm(UnidadeMedida modelo) throws Exception {
		return modelo == null ? new UnidadeMedida() : modelo;
	}

}
