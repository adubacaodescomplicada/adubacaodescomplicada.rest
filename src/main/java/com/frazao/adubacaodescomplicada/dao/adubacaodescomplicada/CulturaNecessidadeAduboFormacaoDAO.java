package com.frazao.adubacaodescomplicada.dao.adubacaodescomplicada;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.frazao.adubacaodescomplicada.modelo.entidade.adubacaodescomplicada.Cultura;
import com.frazao.adubacaodescomplicada.modelo.entidade.adubacaodescomplicada.CulturaNecessidadeAduboFormacao;

@Repository
public interface CulturaNecessidadeAduboFormacaoDAO
		extends JpaRepository<CulturaNecessidadeAduboFormacao, Integer>, CulturaNecessidadeAduboFormacaoDAOFiltro {

	Collection<CulturaNecessidadeAduboFormacao> findAllByCultura(Cultura cultura);

}
