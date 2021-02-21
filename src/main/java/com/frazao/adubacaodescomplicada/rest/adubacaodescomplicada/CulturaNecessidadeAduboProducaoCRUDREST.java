package com.frazao.adubacaodescomplicada.rest.adubacaodescomplicada;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.frazao.adubacaodescomplicada.bo.adubacaodescomplicada.CulturaNecessidadeAduboProducaoBO;
import com.frazao.adubacaodescomplicada.modelo.dto.adubacaodescomplicada.CulturaNecessidadeAduboProducaoFiltroDTO;
import com.frazao.adubacaodescomplicada.modelo.entidade.adubacaodescomplicada.CulturaNecessidadeAduboProducao;
import com.frazao.adubacaodescomplicada.rest.CRUDREST;

@RestController
@RequestMapping(value = "cultura-necessidade-adubo-producao")
public class CulturaNecessidadeAduboProducaoCRUDREST extends
		CRUDREST<CulturaNecessidadeAduboProducao, Integer, CulturaNecessidadeAduboProducaoFiltroDTO, CulturaNecessidadeAduboProducaoBO> {

	public CulturaNecessidadeAduboProducaoCRUDREST(@Autowired CulturaNecessidadeAduboProducaoBO bo) {
		super(bo);
	}

	@Override
	public CulturaNecessidadeAduboProducao prepararForm(CulturaNecessidadeAduboProducao modelo) throws Exception {
		return modelo == null ? new CulturaNecessidadeAduboProducao() : modelo;
	}

}
