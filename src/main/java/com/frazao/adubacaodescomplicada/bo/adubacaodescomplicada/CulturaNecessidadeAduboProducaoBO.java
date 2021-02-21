package com.frazao.adubacaodescomplicada.bo.adubacaodescomplicada;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frazao.adubacaodescomplicada.bo.CRUDBO;
import com.frazao.adubacaodescomplicada.dao.adubacaodescomplicada.CulturaNecessidadeAduboProducaoDAO;
import com.frazao.adubacaodescomplicada.modelo.dto.adubacaodescomplicada.CulturaNecessidadeAduboProducaoFiltroDTO;
import com.frazao.adubacaodescomplicada.modelo.entidade.adubacaodescomplicada.CulturaNecessidadeAduboProducao;

@Service
public class CulturaNecessidadeAduboProducaoBO extends
		CRUDBO<CulturaNecessidadeAduboProducao, Integer, CulturaNecessidadeAduboProducaoFiltroDTO, CulturaNecessidadeAduboProducaoDAO> {

	public CulturaNecessidadeAduboProducaoBO(@Autowired CulturaNecessidadeAduboProducaoDAO dao) {
		super(CulturaNecessidadeAduboProducao.class, dao);
	}

}
