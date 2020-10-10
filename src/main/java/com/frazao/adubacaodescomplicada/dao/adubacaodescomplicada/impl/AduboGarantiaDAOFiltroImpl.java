package com.frazao.adubacaodescomplicada.dao.adubacaodescomplicada.impl;

import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.apache.commons.lang3.ObjectUtils;
import org.springframework.beans.factory.annotation.Value;

import com.frazao.adubacaodescomplicada.dao.adubacaodescomplicada.AduboGarantiaDAOFiltro;
import com.frazao.adubacaodescomplicada.modelo.dto.adubacaodescomplicada.AduboGarantiaFiltroDTO;
import com.frazao.adubacaodescomplicada.modelo.entidade.adubacaodescomplicada.AduboGarantia;

public class AduboGarantiaDAOFiltroImpl implements AduboGarantiaDAOFiltro {

	@Value("${default.database_schema}")
	private String databaseSchema;

	@PersistenceContext
	private EntityManager entityManager;

	@SuppressWarnings("unchecked")
	@Override
	public Collection<AduboGarantia> filtrar(final AduboGarantiaFiltroDTO f) {

		final StringBuilder sql = new StringBuilder();
		sql.append("SELECT em.*").append("\n");
		sql.append("FROM   ").append(this.databaseSchema).append(".adubo_garantia as em").append("\n");
		final StringBuilder arg = new StringBuilder();
		if (ObjectUtils.isNotEmpty(f.getAdubo())) {
			arg.append(adWhere(arg)).append("em.adubo_id = :adubo").append("\n");
		}
		if (ObjectUtils.isNotEmpty(f.getGarantia())) {
			arg.append(adWhere(arg)).append("em.garantia_id = :garantia").append("\n");
		}
		sql.append(arg);
		sql.append("ORDER BY 1").append("\n");
		final Query query = this.entityManager.createNativeQuery(sql.toString(), AduboGarantia.class);
		if (ObjectUtils.isNotEmpty(f.getAdubo())) {
			 query.setParameter("adubo", f.getAdubo().getId());
		}
		if (ObjectUtils.isNotEmpty(f.getGarantia())) {
			query.setParameter("garantia", f.getGarantia().getId());
		}
		return query.getResultList();

	}

}
