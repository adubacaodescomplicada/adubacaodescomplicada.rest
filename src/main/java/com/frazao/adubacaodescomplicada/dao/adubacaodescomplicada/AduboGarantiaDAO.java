package com.frazao.adubacaodescomplicada.dao.adubacaodescomplicada;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.frazao.adubacaodescomplicada.modelo.entidade.adubacaodescomplicada.AduboGarantia;

@Repository
public interface AduboGarantiaDAO extends JpaRepository<AduboGarantia, java.lang.Integer>, AduboGarantiaDAOFiltro {

}
