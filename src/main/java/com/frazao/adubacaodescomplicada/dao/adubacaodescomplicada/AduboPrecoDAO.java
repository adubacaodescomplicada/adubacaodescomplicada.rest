package com.frazao.adubacaodescomplicada.dao.adubacaodescomplicada;

import java.util.Collection;
import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.frazao.adubacaodescomplicada.modelo.entidade.adubacaodescomplicada.Adubo;
import com.frazao.adubacaodescomplicada.modelo.entidade.adubacaodescomplicada.AduboPreco;

@Repository
public interface AduboPrecoDAO extends JpaRepository<AduboPreco, Integer>, AduboPrecoDAOFiltro {
	
	public Collection<AduboPreco> findTop1ByAduboAndDataBeforeOrderByDataDesc(Adubo adubo, Date data);

}
