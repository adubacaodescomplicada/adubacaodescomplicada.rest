package com.frazao.adubacaodescomplicada.dao.adubacaodescomplicada;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.frazao.adubacaodescomplicada.modelo.entidade.adubacaodescomplicada.UnidadeMedida;

@Repository
public interface UnidadeMedidaDAO extends JpaRepository<UnidadeMedida, java.lang.Integer>, UnidadeMedidaDAOFiltro {

}
