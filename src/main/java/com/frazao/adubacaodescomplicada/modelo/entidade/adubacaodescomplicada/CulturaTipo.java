package com.frazao.adubacaodescomplicada.modelo.entidade.adubacaodescomplicada;

import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import java.util.stream.Collectors;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.frazao.adubacaodescomplicada.modelo.dominio.IdadeFaseCultivo;
import com.frazao.adubacaodescomplicada.modelo.entidade.EntidadeBaseTemId;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity(name = "CulturaTipo")
@Table(name = "cultura_tipo")
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class CulturaTipo extends EntidadeBaseTemId<Integer> {

	private static final long serialVersionUID = 1L;

	@Column(name = "codigo")
	private String codigo;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;

	@Column(name = "idade_fase_cultivo")
	private String idadeFaseCultivo;

	@Column(name = "nome")
	private String nome;

	public CulturaTipo(Integer id) {
		super(id);
	}

	@SuppressWarnings("unchecked")
	public Set<IdadeFaseCultivo> getIdadeFaseCultivo() {
		return this.idadeFaseCultivo == null ? Collections.EMPTY_SET
				: Collections.unmodifiableSet(Arrays.asList(IdadeFaseCultivo.values()).stream()
						.filter(r -> this.idadeFaseCultivo.indexOf(r.name()) >= 0).collect(Collectors.toSet()));
	}

	public void setIdadeFaseCultivo(Set<IdadeFaseCultivo> idadeFaseCultivo) {
		this.idadeFaseCultivo = String.join(",",
				idadeFaseCultivo.stream().map(r -> r.name()).collect(Collectors.toSet()));
	}

}
