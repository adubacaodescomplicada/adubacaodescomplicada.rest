package com.frazao.adubacaodescomplicada.dao.adubacaodescomplicada;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.frazao.adubacaodescomplicada.modelo.entidade.adubacaodescomplicada.Garantia;

@Repository
public interface GarantiaDAO extends JpaRepository<Garantia, java.lang.Integer>, GarantiaDAOFiltro {

}
