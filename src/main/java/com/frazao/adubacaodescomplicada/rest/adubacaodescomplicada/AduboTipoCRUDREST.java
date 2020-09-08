package com.frazao.adubacaodescomplicada.rest.adubacaodescomplicada;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.frazao.adubacaodescomplicada.rest.CRUDREST;
import com.frazao.adubacaodescomplicada.modelo.entidade.adubacaodescomplicada.AduboTipo;
import com.frazao.adubacaodescomplicada.bo.adubacaodescomplicada.AduboTipoBO;
import com.frazao.adubacaodescomplicada.modelo.dto.adubacaodescomplicada.AduboTipoFiltroDTO;

@RestController
@RequestMapping(value = "adubo-tipo")
public class AduboTipoCRUDREST extends CRUDREST<AduboTipo, Integer, AduboTipoFiltroDTO, AduboTipoBO> {

	public AduboTipoCRUDREST(@Autowired AduboTipoBO bo) {
		super(bo);
	}

	public AduboTipoBO getBO() {
		return super.getBO();
	}

	@Override
	public AduboTipo prepararForm(AduboTipo modelo) throws Exception {
		return modelo == null ? new AduboTipo() : modelo;
	}

}
