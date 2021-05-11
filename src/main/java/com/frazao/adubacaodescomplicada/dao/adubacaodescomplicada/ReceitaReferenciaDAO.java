package com.frazao.adubacaodescomplicada.dao.adubacaodescomplicada;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.frazao.adubacaodescomplicada.modelo.entidade.adubacaodescomplicada.ReceitaReferencia;

@Repository
public interface ReceitaReferenciaDAO extends JpaRepository<ReceitaReferencia, java.lang.Integer>, ReceitaReferenciaDAOFiltro {

}
