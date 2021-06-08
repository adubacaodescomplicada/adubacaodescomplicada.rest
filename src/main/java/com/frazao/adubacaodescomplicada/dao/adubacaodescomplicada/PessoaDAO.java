package com.frazao.adubacaodescomplicada.dao.adubacaodescomplicada;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.frazao.adubacaodescomplicada.modelo.entidade.adubacaodescomplicada.Pessoa;

@Repository
public interface PessoaDAO extends JpaRepository<Pessoa, java.lang.Integer>, PessoaDAOFiltro {

	void iniciaPrecoAdubo(Pessoa pessoa);

}
