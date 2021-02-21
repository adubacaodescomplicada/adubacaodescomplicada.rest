package com.frazao.adubacaodescomplicada.modelo.entidade.adubacaodescomplicada;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.frazao.adubacaodescomplicada.modelo.dominio.CulturaIdadePlantioUnidade;
import com.frazao.adubacaodescomplicada.modelo.entidade.EntidadeBaseTemId;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity(name = "CulturaIdadePlantio")
@Table(name = "cultura_idade_plantio")
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)

public class CulturaIdadePlantio extends EntidadeBaseTemId<Integer> {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;

	@Column(name = "nome")
	private String nome;

	@Column(name = "unidade")
	@Enumerated(EnumType.STRING)
	private CulturaIdadePlantioUnidade unidade;

	@Column(name = "quantidade")
	private Integer quantidade;

	@ManyToOne
	@JsonIgnore
	private Cultura cultura;
	
	public CulturaIdadePlantio(Integer id) {
		super(id);
	}

}
