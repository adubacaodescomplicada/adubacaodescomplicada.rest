package com.frazao.adubacaodescomplicada.dao.adubacaodescomplicada;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.frazao.adubacaodescomplicada.modelo.entidade.adubacaodescomplicada.PessoaEndereco;

@Repository
public interface PessoaEnderecoDAO extends JpaRepository<PessoaEndereco, java.lang.Integer>, PessoaEnderecoDAOFiltro {

}
