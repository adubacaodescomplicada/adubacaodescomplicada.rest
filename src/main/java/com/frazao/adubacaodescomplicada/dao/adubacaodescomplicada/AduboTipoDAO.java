package com.frazao.adubacaodescomplicada.dao.adubacaodescomplicada;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.frazao.adubacaodescomplicada.modelo.entidade.adubacaodescomplicada.AduboTipo;

@Repository
public interface AduboTipoDAO extends JpaRepository<AduboTipo, java.lang.Integer>, AduboTipoDAOFiltro {

}
