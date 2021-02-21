package com.frazao.adubacaodescomplicada.dao.adubacaodescomplicada;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.frazao.adubacaodescomplicada.modelo.entidade.adubacaodescomplicada.Cultura;
import com.frazao.adubacaodescomplicada.modelo.entidade.adubacaodescomplicada.CulturaNecessidadeAduboProducao;

@Repository
public interface CulturaNecessidadeAduboProducaoDAO extends
		JpaRepository<CulturaNecessidadeAduboProducao, Integer>, CulturaNecessidadeAduboProducaoDAOFiltro {
	
	Collection<CulturaNecessidadeAduboProducao> findAllByCultura(Cultura cultura);

}
