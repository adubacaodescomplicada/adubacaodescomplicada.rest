package com.frazao.adubacaodescomplicada.dao.adubacaodescomplicada.impl;

import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Value;

import com.frazao.adubacaodescomplicada.dao.adubacaodescomplicada.FonteMateriaOrganicaDAOFiltro;
import com.frazao.adubacaodescomplicada.modelo.dto.adubacaodescomplicada.FonteMateriaOrganicaFiltroDTO;
import com.frazao.adubacaodescomplicada.modelo.entidade.adubacaodescomplicada.FonteMateriaOrganica;

public class FonteMateriaOrganicaDAOFiltroImpl implements FonteMateriaOrganicaDAOFiltro {
	

	@Value("${default.database_schema}")
	private String databaseSchema;

   @PersistenceContext
   private EntityManager entityManager;

   @SuppressWarnings("unchecked")
   @Override
   public Collection<FonteMateriaOrganica> filtrar(FonteMateriaOrganicaFiltroDTO f) {

      StringBuilder sql = new StringBuilder();
      sql.append("SELECT em.*").append("\n");
      sql.append("FROM   ").append(this.databaseSchema).append(".fonte_materia_organica as em").append("\n");
      StringBuilder arg = new StringBuilder();
      // if (StringUtils.isNotBlank(f.getCpfCnpj())) {
      //    arg.append(adWhere(arg)).append("em.cpf_cnpj = :cpfCnpj").append("\n");
      // }
      // if (ObjectUtils.isNotEmpty(f.getTipo())) {
      //    arg.append(adWhere(arg)).append("em.pessoa_tipo in :tipo").append("\n");
      // }
      sql.append(arg);
      sql.append("ORDER BY 1").append("\n");
      Query query = entityManager.createNativeQuery(sql.toString(), FonteMateriaOrganica.class);
      // if (StringUtils.isNotBlank(f.getCpfCnpj())) {
      //    query.setParameter("cpfCnpj", f.getCpfCnpj());
      // }
      // if (ObjectUtils.isNotEmpty(f.getTipo())) {
      //    query.setParameter("tipo", f.getTipo().stream().map(v -> v.name()).collect(Collectors.toSet()));
      // }
      return query.getResultList();

   }

}