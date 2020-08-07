package com.frazao.adubacaodescomplicada.dao.adubacaodescomplicada;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.frazao.adubacaodescomplicada.modelo.entidade.adubacaodescomplicada.Nutriente;

@Repository
public interface NutrienteDAO extends JpaRepository<Nutriente, java.lang.Integer>, NutrienteDAOFiltro {

}
