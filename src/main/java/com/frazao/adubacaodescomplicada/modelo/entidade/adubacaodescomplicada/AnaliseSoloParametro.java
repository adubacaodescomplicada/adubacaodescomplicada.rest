package com.frazao.adubacaodescomplicada.modelo.entidade.adubacaodescomplicada;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.frazao.adubacaodescomplicada.modelo.entidade.EntidadeBaseTemId;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity(name = "AnaliseSoloParametro")
@Table(name = "analise_solo_parametro")
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)

public class AnaliseSoloParametro extends EntidadeBaseTemId<Integer> {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;

	@Column(name = "nome")
	private String nome;

	@Column(name = "codigo")
	private String codigo;

	@Column(name = "sigla")
	private String sigla;
	
	@JoinColumn(name = "unidade_medida_id")
	@ManyToOne
	private UnidadeMedida unidadeMedida;
	
	@Column(name = "ordem")
	private Integer ordem;

}
