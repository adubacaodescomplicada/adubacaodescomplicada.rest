package com.frazao.adubacaodescomplicada.bo.adubacaodescomplicada;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frazao.adubacaodescomplicada.bo.CRUDBO;
import com.frazao.adubacaodescomplicada.dao.adubacaodescomplicada.PessoaAduboPrecoDAO;
import com.frazao.adubacaodescomplicada.modelo.dto.adubacaodescomplicada.PessoaAduboPrecoFiltroDTO;
import com.frazao.adubacaodescomplicada.modelo.entidade.adubacaodescomplicada.PessoaAduboPreco;

@Service
public class PessoaAduboPrecoBO
		extends CRUDBO<PessoaAduboPreco, Integer, PessoaAduboPrecoFiltroDTO, PessoaAduboPrecoDAO> {

	public PessoaAduboPrecoBO(@Autowired PessoaAduboPrecoDAO dao) {
		super(PessoaAduboPreco.class, dao);
	}

}
