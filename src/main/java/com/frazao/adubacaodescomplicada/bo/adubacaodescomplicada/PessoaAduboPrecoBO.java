package com.frazao.adubacaodescomplicada.bo.adubacaodescomplicada;

import java.security.Principal;
import java.util.Collection;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frazao.adubacaodescomplicada.bo.BOException;
import com.frazao.adubacaodescomplicada.bo.CRUDBO;
import com.frazao.adubacaodescomplicada.dao.adubacaodescomplicada.PessoaAduboPrecoDAO;
import com.frazao.adubacaodescomplicada.modelo.dto.adubacaodescomplicada.PessoaAduboPrecoFiltroDTO;
import com.frazao.adubacaodescomplicada.modelo.entidade.adubacaodescomplicada.Pessoa;
import com.frazao.adubacaodescomplicada.modelo.entidade.adubacaodescomplicada.PessoaAduboPreco;

@Service
public class PessoaAduboPrecoBO
		extends CRUDBO<PessoaAduboPreco, Integer, PessoaAduboPrecoFiltroDTO, PessoaAduboPrecoDAO> {

	public PessoaAduboPrecoBO(@Autowired PessoaAduboPrecoDAO dao) {
		super(PessoaAduboPreco.class, dao);
	}

	public Integer createAll(Pessoa pessoa, Collection<PessoaAduboPreco> t, Principal usuario)
			throws BOException {
		Integer result = 0;
		
		PessoaAduboPrecoFiltroDTO filtro = new PessoaAduboPrecoFiltroDTO();
		filtro.setPessoa(pessoa);
		Collection<PessoaAduboPreco> atual = this.filter(filtro, usuario);
		
		for (PessoaAduboPreco pap : atual) {
			for (PessoaAduboPreco papNovo : t) {
				if (pap.getPessoa().getId() == papNovo.getPessoa().getId()
						&& pap.getAdubo().getId() == papNovo.getAdubo().getId()
						&& pap.getUnidadeMedida().getId() == papNovo.getUnidadeMedida().getId()) {
					if (!pap.getValor().equals(papNovo.getValor())) {
						papNovo.setData(new Date());
						update(papNovo.getId(), papNovo, usuario);
						result++;
					}
				}
			}
		}
		return result;
	}

}
