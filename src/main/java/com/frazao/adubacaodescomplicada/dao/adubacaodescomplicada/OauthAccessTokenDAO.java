package com.frazao.adubacaodescomplicada.dao.adubacaodescomplicada;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.frazao.adubacaodescomplicada.modelo.entidade.adubacaodescomplicada.OauthAccessToken;

@Repository
public interface OauthAccessTokenDAO
		extends JpaRepository<OauthAccessToken, java.lang.Integer>, OauthAccessTokenDAOFiltro {

}
