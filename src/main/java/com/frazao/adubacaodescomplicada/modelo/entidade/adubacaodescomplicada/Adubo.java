package com.frazao.adubacaodescomplicada.modelo.entidade.adubacaodescomplicada;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.frazao.adubacaodescomplicada.modelo.dominio.Confirmacao;
import com.frazao.adubacaodescomplicada.modelo.entidade.EntidadeBaseTemId;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity(name = "Adubo")
@Table(name = "adubo")
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)

public class Adubo extends EntidadeBaseTemId<Integer> {

	private static final long serialVersionUID = 1L;

	@OneToMany(mappedBy = "adubo")
	private List<AduboGarantia> aduboGarantiaList = new ArrayList<>();

//	@OneToMany(mappedBy = "adubo")
	@Transient
	private List<AduboPreco> aduboPrecoList = new ArrayList<>();

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "adubo_tipo_id")
	private AduboTipo aduboTipo;

	@Column(name = "codigo")
	private String codigo;

	@Column(name = "descricao")
	@Lob
	private String descricao;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;

	@Column(name = "nome")
	private String nome;

	@Column(name = "quantidade_quilo_cova")
	private BigDecimal quantidadeQuiloCova;
	
	@Column(name="para_cobertura")
	@Enumerated(EnumType.STRING)
	private Confirmacao paraCobertura;
	
	@Column(name="para_fertirrigacao")
	@Enumerated(EnumType.STRING)
	private Confirmacao paraFertirrigacao;

	public Adubo(Integer id) {
		super(id);
	}

	public Adubo(Integer id, String codigo, String nome, String descricao, AduboTipo aduboTipo) {
		super(id);
		this.codigo = codigo;
		this.nome = nome;
		this.descricao = descricao;
		this.aduboTipo = aduboTipo;
	}

}
