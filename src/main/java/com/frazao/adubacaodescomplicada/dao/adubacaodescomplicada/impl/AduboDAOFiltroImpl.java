package com.frazao.adubacaodescomplicada.dao.adubacaodescomplicada.impl;

import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Value;

import com.frazao.adubacaodescomplicada.dao.adubacaodescomplicada.AduboDAOFiltro;
import com.frazao.adubacaodescomplicada.modelo.dto.adubacaodescomplicada.AduboFiltroDTO;
import com.frazao.adubacaodescomplicada.modelo.entidade.adubacaodescomplicada.Adubo;

public class AduboDAOFiltroImpl implements AduboDAOFiltro {

	@Value("${default.database_schema}")
	private String databaseSchema;

	@PersistenceContext
	private EntityManager entityManager;

	@SuppressWarnings("unchecked")
	@Override
	public Collection<Adubo> filtrar(final AduboFiltroDTO f) {

		final StringBuilder sql = new StringBuilder();
		sql.append("SELECT em.*").append("\n");
		sql.append("FROM   ").append(this.databaseSchema).append(".adubo as em").append("\n");
		final StringBuilder arg = new StringBuilder();
		// if (StringUtils.isNotBlank(f.getCpfCnpj())) {
		// arg.append(adWhere(arg)).append("em.cpf_cnpj = :cpfCnpj").append("\n");
		// }
		// if (ObjectUtils.isNotEmpty(f.getTipo())) {
		// arg.append(adWhere(arg)).append("em.pessoa_tipo in :tipo").append("\n");
		// }
		sql.append(arg);
		sql.append("ORDER BY 1").append("\n");
		final Query query = this.entityManager.createNativeQuery(sql.toString(), Adubo.class);
		// if (StringUtils.isNotBlank(f.getCpfCnpj())) {
		// query.setParameter("cpfCnpj", f.getCpfCnpj());
		// }
		// if (ObjectUtils.isNotEmpty(f.getTipo())) {
		// query.setParameter("tipo", f.getTipo().stream().map(v ->
		// v.name()).collect(Collectors.toSet()));
		// }
		Collection<Adubo> result = query.getResultList();
		if (result != null) {
			result.forEach(e -> e.getAduboGarantiaList().forEach(e1 -> e1.setAdubo(null)));
		}
		return result;
	}

}
