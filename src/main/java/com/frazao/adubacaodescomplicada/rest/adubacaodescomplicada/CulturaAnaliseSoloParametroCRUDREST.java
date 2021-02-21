package com.frazao.adubacaodescomplicada.rest.adubacaodescomplicada;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.frazao.adubacaodescomplicada.bo.adubacaodescomplicada.CulturaAnaliseSoloParametroBO;
import com.frazao.adubacaodescomplicada.modelo.dto.adubacaodescomplicada.CulturaAnaliseSoloParametroFiltroDTO;
import com.frazao.adubacaodescomplicada.modelo.entidade.adubacaodescomplicada.CulturaAnaliseSoloParametro;
import com.frazao.adubacaodescomplicada.rest.CRUDREST;

@RestController
@RequestMapping(value = "cultura-analise-solo-parametro")
public class CulturaAnaliseSoloParametroCRUDREST extends
		CRUDREST<CulturaAnaliseSoloParametro, Integer, CulturaAnaliseSoloParametroFiltroDTO, CulturaAnaliseSoloParametroBO> {

	public CulturaAnaliseSoloParametroCRUDREST(@Autowired CulturaAnaliseSoloParametroBO bo) {
		super(bo);
	}

	@Override
	public CulturaAnaliseSoloParametro prepararForm(CulturaAnaliseSoloParametro modelo) throws Exception {
		return modelo == null ? new CulturaAnaliseSoloParametro() : modelo;
	}

}
