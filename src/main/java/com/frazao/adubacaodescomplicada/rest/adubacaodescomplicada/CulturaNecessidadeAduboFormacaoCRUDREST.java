package com.frazao.adubacaodescomplicada.rest.adubacaodescomplicada;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.frazao.adubacaodescomplicada.bo.adubacaodescomplicada.CulturaNecessidadeAduboFormacaoBO;
import com.frazao.adubacaodescomplicada.modelo.dto.adubacaodescomplicada.CulturaNecessidadeAduboFormacaoFiltroDTO;
import com.frazao.adubacaodescomplicada.modelo.entidade.adubacaodescomplicada.CulturaNecessidadeAduboFormacao;
import com.frazao.adubacaodescomplicada.rest.CRUDREST;

@RestController
@RequestMapping(value = "cultura-necessidade-adubo-formacao")
public class CulturaNecessidadeAduboFormacaoCRUDREST extends
		CRUDREST<CulturaNecessidadeAduboFormacao, Integer, CulturaNecessidadeAduboFormacaoFiltroDTO, CulturaNecessidadeAduboFormacaoBO> {

	public CulturaNecessidadeAduboFormacaoCRUDREST(@Autowired CulturaNecessidadeAduboFormacaoBO bo) {
		super(bo);
	}

	@Override
	public CulturaNecessidadeAduboFormacao prepararForm(CulturaNecessidadeAduboFormacao modelo, Principal usuario) throws Exception {
		return modelo == null ? new CulturaNecessidadeAduboFormacao() : modelo;
	}

}
