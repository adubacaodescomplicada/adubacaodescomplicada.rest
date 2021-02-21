package com.frazao.adubacaodescomplicada.bo.adubacaodescomplicada;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frazao.adubacaodescomplicada.bo.CRUDBO;
import com.frazao.adubacaodescomplicada.dao.adubacaodescomplicada.CulturaNecessidadeAduboFormacaoDAO;
import com.frazao.adubacaodescomplicada.modelo.dto.adubacaodescomplicada.CulturaNecessidadeAduboFormacaoFiltroDTO;
import com.frazao.adubacaodescomplicada.modelo.entidade.adubacaodescomplicada.CulturaNecessidadeAduboFormacao;

@Service
public class CulturaNecessidadeAduboFormacaoBO extends
		CRUDBO<CulturaNecessidadeAduboFormacao, java.lang.Integer, CulturaNecessidadeAduboFormacaoFiltroDTO, CulturaNecessidadeAduboFormacaoDAO> {

	public CulturaNecessidadeAduboFormacaoBO(@Autowired CulturaNecessidadeAduboFormacaoDAO dao) {
		super(CulturaNecessidadeAduboFormacao.class, dao);
	}

}
