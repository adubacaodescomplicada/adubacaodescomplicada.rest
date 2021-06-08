package com.frazao.adubacaodescomplicada.dao.adubacaodescomplicada.impl;

import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Value;

import com.frazao.adubacaodescomplicada.dao.adubacaodescomplicada.PessoaDAOFiltro;
import com.frazao.adubacaodescomplicada.modelo.dto.adubacaodescomplicada.PessoaFiltroDTO;
import com.frazao.adubacaodescomplicada.modelo.entidade.adubacaodescomplicada.Pessoa;

public class PessoaDAOFiltroImpl implements PessoaDAOFiltro {

	@Value("${default.database_schema}")
	private String databaseSchema;

	@PersistenceContext
	private EntityManager entityManager;

	@SuppressWarnings("unchecked")
	@Override
	public Collection<Pessoa> filtrar(final PessoaFiltroDTO f) {

		final StringBuilder sql = new StringBuilder();
		sql.append("SELECT em.*").append("\n");
		sql.append("FROM   ").append(this.databaseSchema).append(".pessoa as em").append("\n");
		final StringBuilder arg = new StringBuilder();
		// if (StringUtils.isNotBlank(f.getCpfCnpj())) {
		// arg.append(adWhere(arg)).append("em.cpf_cnpj = :cpfCnpj").append("\n");
		// }
		// if (ObjectUtils.isNotEmpty(f.getTipo())) {
		// arg.append(adWhere(arg)).append("em.pessoa_tipo in :tipo").append("\n");
		// }
		sql.append(arg);
		sql.append("ORDER BY 1").append("\n");
		final Query query = this.entityManager.createNativeQuery(sql.toString(), Pessoa.class);
		// if (StringUtils.isNotBlank(f.getCpfCnpj())) {
		// query.setParameter("cpfCnpj", f.getCpfCnpj());
		// }
		// if (ObjectUtils.isNotEmpty(f.getTipo())) {
		// query.setParameter("tipo", f.getTipo().stream().map(v ->
		// v.name()).collect(Collectors.toSet()));
		// }
		return query.getResultList();

	}

	@Override
	public void iniciaPrecoAdubo(Pessoa pessoa) {

		final StringBuilder sql = new StringBuilder();
		
        sql.append("INSERT INTO ").append(this.databaseSchema).append(".pessoa_adubo_preco ").append("\n");
        sql.append("     (pessoa_id, adubo_id, unidade_medida_id, data, valor)").append("\n");
        sql.append("SELECT ").append(pessoa.getId()).append("\n");
        sql.append("     , preco.adubo_id").append("\n");
        sql.append("     , preco.unidade_medida_id").append("\n");
        sql.append("     , preco.data").append("\n");
        sql.append("     , preco.valor").append("\n");
        sql.append("FROM      ").append(this.databaseSchema).append(".adubo_preco preco").append("\n");
        sql.append("JOIN      (SELECT preco_maior.adubo_id").append("\n");
        sql.append("                , preco_maior.unidade_medida_id").append("\n");
        sql.append("                , MAX(preco_maior.data) AS data").append("\n");
        sql.append("           FROM ").append(this.databaseSchema).append(".adubo_preco preco_maior").append("\n");
        sql.append("           WHERE preco_maior.data <= NOW()").append("\n");
        sql.append("           GROUP BY preco_maior.adubo_id").append("\n");
        sql.append("                  , preco_maior.unidade_medida_id) preco_atual ").append("\n");
        sql.append("ON        preco_atual.adubo_id = preco.adubo_id").append("\n");
        sql.append("AND       preco_atual.unidade_medida_id = preco.unidade_medida_id").append("\n");
        sql.append("AND       preco_atual.data = preco.data").append("\n");
        sql.append("LEFT JOIN ").append(this.databaseSchema).append(".pessoa_adubo_preco pessoa_adubo_preco").append("\n");
        sql.append("ON        preco.adubo_id = pessoa_adubo_preco.adubo_id").append("\n");
        sql.append("AND       preco.unidade_medida_id = pessoa_adubo_preco.unidade_medida_id").append("\n");
        sql.append("LEFT JOIN (SELECT pessoa_preco_maior.pessoa_id").append("\n");
        sql.append("                , pessoa_preco_maior.adubo_id").append("\n");
        sql.append("                , pessoa_preco_maior.unidade_medida_id").append("\n");
        sql.append("                , MAX(pessoa_preco_maior.data) AS data").append("\n");
        sql.append("           FROM ").append(this.databaseSchema).append(".pessoa_adubo_preco pessoa_preco_maior").append("\n");
        sql.append("           WHERE pessoa_preco_maior.data <= NOW()").append("\n");
        sql.append("           GROUP BY pessoa_preco_maior.pessoa_id ").append("\n");
        sql.append("                  , pessoa_preco_maior.adubo_id ").append("\n");
        sql.append("                  , pessoa_preco_maior.unidade_medida_id) pessoa_adubo_preco_atual ").append("\n");
        sql.append("ON        pessoa_adubo_preco_atual.pessoa_id = pessoa_adubo_preco.pessoa_id").append("\n");
        sql.append("AND       pessoa_adubo_preco_atual.adubo_id = pessoa_adubo_preco.adubo_id").append("\n");
        sql.append("AND       pessoa_adubo_preco_atual.unidade_medida_id = pessoa_adubo_preco.unidade_medida_id").append("\n");
        sql.append("AND       pessoa_adubo_preco.pessoa_id = ").append(pessoa.getId()).append("\n");
        sql.append("WHERE     pessoa_adubo_preco.pessoa_id IS NULL").append("\n");

		final Query query = this.entityManager.createNativeQuery(sql.toString());

		query.executeUpdate();

	}

}
