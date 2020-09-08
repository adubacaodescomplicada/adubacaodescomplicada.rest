package com.frazao.adubacaodescomplicada.rest.adubacaodescomplicada;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.frazao.adubacaodescomplicada.bo.adubacaodescomplicada.AnaliseSoloParametroBO;
import com.frazao.adubacaodescomplicada.modelo.dto.adubacaodescomplicada.AnaliseSoloParametroFiltroDTO;
import com.frazao.adubacaodescomplicada.modelo.entidade.adubacaodescomplicada.AnaliseSoloParametro;
import com.frazao.adubacaodescomplicada.rest.CRUDREST;

@RestController
@RequestMapping(value = "analise-solo-parametro")
public class AnaliseSoloParametroCRUDREST
		extends CRUDREST<AnaliseSoloParametro, Integer, AnaliseSoloParametroFiltroDTO, AnaliseSoloParametroBO> {

	public AnaliseSoloParametroCRUDREST(@Autowired AnaliseSoloParametroBO bo) {
		super(bo);
	}

	public AnaliseSoloParametroBO getBO() {
		return super.getBO();
	}

	@Override
	public AnaliseSoloParametro prepararForm(AnaliseSoloParametro modelo) throws Exception {
		return modelo == null ? new AnaliseSoloParametro() : modelo;
	}

}
