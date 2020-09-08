package com.frazao.adubacaodescomplicada.dao.adubacaodescomplicada;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.frazao.adubacaodescomplicada.modelo.entidade.adubacaodescomplicada.AnaliseSoloParametro;

@Repository
public interface AnaliseSoloParametroDAO extends JpaRepository<AnaliseSoloParametro, Integer>, AnaliseSoloParametroDAOFiltro {

}
