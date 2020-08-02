package com.frazao.adubacaodescomplicada.dao.adubacaodescomplicada;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.frazao.adubacaodescomplicada.modelo.entidade.adubacaodescomplicada.OauthClientDetails;

@Repository
public interface OauthClientDetailsDAO
		extends JpaRepository<OauthClientDetails, java.lang.Integer>, OauthClientDetailsDAOFiltro {

}
