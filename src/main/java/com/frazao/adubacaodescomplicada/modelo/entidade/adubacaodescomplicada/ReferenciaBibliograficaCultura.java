package com.frazao.adubacaodescomplicada.modelo.entidade.adubacaodescomplicada;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.frazao.adubacaodescomplicada.modelo.entidade.EntidadeBaseTemId;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity(name = "ReferenciaBibliograficaCultura")
@Table(name = "referencia_bibliografica_cultura")
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)

public class ReferenciaBibliograficaCultura extends EntidadeBaseTemId<Integer> {

	private static final long serialVersionUID = 1L;

	@Column(name = "meta_saturacao_base")
	private Integer metaSaturacaoBase;

	@ManyToOne()
	@JoinColumn(name = "referencia_bibliografica_id")
	private ReferenciaBibliografica referenciaBibliografica;

	@JsonIgnore
	@ManyToOne()
	@JoinColumn(name = "cultura_id")
	private Cultura cultura;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;

	@Column(name = "nome")
	private String nome;

	public ReferenciaBibliograficaCultura(Integer id) {
		super(id);
	}

}
