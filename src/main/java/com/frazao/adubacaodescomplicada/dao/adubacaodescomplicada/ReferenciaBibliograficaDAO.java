package com.frazao.adubacaodescomplicada.dao.adubacaodescomplicada;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.frazao.adubacaodescomplicada.modelo.entidade.adubacaodescomplicada.ReferenciaBibliografica;

@Repository
public interface ReferenciaBibliograficaDAO extends JpaRepository<ReferenciaBibliografica, java.lang.Integer>, ReferenciaBibliograficaDAOFiltro {

}
