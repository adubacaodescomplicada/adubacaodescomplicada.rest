package com.frazao.adubacaodescomplicada.dao.adubacaodescomplicada;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.frazao.adubacaodescomplicada.modelo.entidade.adubacaodescomplicada.OauthClientToken;

@Repository
public interface OauthClientTokenDAO
		extends JpaRepository<OauthClientToken, java.lang.Integer>, OauthClientTokenDAOFiltro {

}
