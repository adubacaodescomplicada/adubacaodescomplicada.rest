package com.frazao.adubacaodescomplicada.dao.adubacaodescomplicada;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.frazao.adubacaodescomplicada.modelo.entidade.adubacaodescomplicada.Endereco;

@Repository
public interface EnderecoDAO extends JpaRepository<Endereco, java.lang.Integer>, EnderecoDAOFiltro {

}
