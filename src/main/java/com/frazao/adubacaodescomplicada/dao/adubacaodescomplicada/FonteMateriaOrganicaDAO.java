package com.frazao.adubacaodescomplicada.dao.adubacaodescomplicada;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.frazao.adubacaodescomplicada.modelo.entidade.adubacaodescomplicada.FonteMateriaOrganica;

@Repository
public interface FonteMateriaOrganicaDAO
		extends JpaRepository<FonteMateriaOrganica, java.lang.Integer>, FonteMateriaOrganicaDAOFiltro {

}
