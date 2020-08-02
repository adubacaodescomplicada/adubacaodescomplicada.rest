package com.frazao.adubacaodescomplicada.dao.adubacaodescomplicada.impl;

import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.frazao.adubacaodescomplicada.dao.adubacaodescomplicada.OauthClientDetailsDAOFiltro;
import com.frazao.adubacaodescomplicada.modelo.dto.adubacaodescomplicada.OauthClientDetailsFiltroDTO;
import com.frazao.adubacaodescomplicada.modelo.entidade.adubacaodescomplicada.OauthClientDetails;

public class OauthClientDetailsDAOFiltroImpl implements OauthClientDetailsDAOFiltro {

	@PersistenceContext
	private EntityManager entityManager;

	@SuppressWarnings("unchecked")
	@Override
	public Collection<OauthClientDetails> filtrar(final OauthClientDetailsFiltroDTO f) {

		final StringBuilder sql = new StringBuilder();
		sql.append("SELECT em.*").append("\n");
		sql.append("FROM   adubacaodescomplicada.oauth_client_details as em").append("\n");
		final StringBuilder arg = new StringBuilder();
		// if (StringUtils.isNotBlank(f.getCpfCnpj())) {
		// arg.append(adWhere(arg)).append("em.cpf_cnpj = :cpfCnpj").append("\n");
		// }
		// if (ObjectUtils.isNotEmpty(f.getTipo())) {
		// arg.append(adWhere(arg)).append("em.pessoa_tipo in :tipo").append("\n");
		// }
		sql.append(arg);
		sql.append("ORDER BY 1").append("\n");
		final Query query = this.entityManager.createNativeQuery(sql.toString(), OauthClientDetails.class);
		// if (StringUtils.isNotBlank(f.getCpfCnpj())) {
		// query.setParameter("cpfCnpj", f.getCpfCnpj());
		// }
		// if (ObjectUtils.isNotEmpty(f.getTipo())) {
		// query.setParameter("tipo", f.getTipo().stream().map(v ->
		// v.name()).collect(Collectors.toSet()));
		// }
		return query.getResultList();

	}

}
