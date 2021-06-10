package com.frazao.adubacaodescomplicada.dao.adubacaodescomplicada.impl;

import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.StringUtils;

import com.frazao.adubacaodescomplicada.dao.adubacaodescomplicada.PessoaAduboPrecoDAOFiltro;
import com.frazao.adubacaodescomplicada.modelo.dto.adubacaodescomplicada.PessoaAduboPrecoFiltroDTO;
import com.frazao.adubacaodescomplicada.modelo.entidade.adubacaodescomplicada.Adubo;
import com.frazao.adubacaodescomplicada.modelo.entidade.adubacaodescomplicada.Pessoa;
import com.frazao.adubacaodescomplicada.modelo.entidade.adubacaodescomplicada.PessoaAduboPreco;

public class PessoaAduboPrecoDAOFiltroImpl implements PessoaAduboPrecoDAOFiltro {

	@Value("${default.database_schema}")
	private String databaseSchema;

	@PersistenceContext
	private EntityManager entityManager;

	@SuppressWarnings("unchecked")
	@Override
	public Collection<PessoaAduboPreco> filtrar(final PessoaAduboPrecoFiltroDTO f) {

		final StringBuilder sql = new StringBuilder();
		sql.append("SELECT em.*").append("\n");
		sql.append("FROM   ").append(this.databaseSchema).append(".pessoa_adubo_preco as em").append("\n");
		if (!StringUtils.isEmpty(f.getConteudo()) || f.getAduboTipo() != null) {
			sql.append("JOIN   ").append(this.databaseSchema).append(".adubo as ad ON ad.id = em.adubo_id")
					.append("\n");
			sql.append("JOIN   ").append(this.databaseSchema).append(".adubo_tipo as adt ON adt.id = ad.adubo_tipo_id")
					.append("\n");
		}
		final StringBuilder arg = new StringBuilder();
		if (f.getPessoa() != null) {
			arg.append(adWhere(arg)).append("em.pessoa_id = :pessoaId").append("\n");
		}
		if (!StringUtils.isEmpty(f.getConteudo())) {
			arg.append(adWhere(arg)).append("ad.nome like :conteudo").append("\n");
		}
		if (f.getAduboTipo() != null) {
			arg.append(adWhere(arg)).append("adt.codigo = :codigo").append("\n");
		}
		sql.append(arg);
		sql.append("ORDER BY 1").append("\n");

		final Query query = this.entityManager.createNativeQuery(sql.toString(), PessoaAduboPreco.class);
		if (f.getPessoa() != null) {
			query.setParameter("pessoaId", f.getPessoa().getId());
		}
		if (!StringUtils.isEmpty(f.getConteudo())) {
			query.setParameter("conteudo", like(f.getConteudo()));
		}
		if (f.getAduboTipo() != null) {
			query.setParameter("codigo", f.getAduboTipo().getCodigo());
		}

		Collection<PessoaAduboPreco> result = query.getResultList();

		if (result != null && !result.isEmpty()) {
			result.forEach(e -> {
				e.setPessoa(new Pessoa(e.getPessoa().getId()));
				e.setAdubo(new Adubo(e.getAdubo().getId(), e.getAdubo().getCodigo(), e.getAdubo().getNome(),
						e.getAdubo().getDescricao(), e.getAdubo().getAduboTipo()));
			});
		}

		return result;

	}

}
