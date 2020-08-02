package com.frazao.adubacaodescomplicada.dao.adubacaodescomplicada;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.frazao.adubacaodescomplicada.modelo.entidade.adubacaodescomplicada.Adubo;

@Repository
public interface AduboDAO extends JpaRepository<Adubo, java.lang.Integer>, AduboDAOFiltro {

}
