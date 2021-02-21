package com.frazao.adubacaodescomplicada.dao.adubacaodescomplicada;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.frazao.adubacaodescomplicada.modelo.entidade.adubacaodescomplicada.CulturaAnaliseSoloParametro;

@Repository
public interface CulturaAnaliseSoloParametroDAO
		extends JpaRepository<CulturaAnaliseSoloParametro, Integer>, CulturaAnaliseSoloParametroDAOFiltro {

}
