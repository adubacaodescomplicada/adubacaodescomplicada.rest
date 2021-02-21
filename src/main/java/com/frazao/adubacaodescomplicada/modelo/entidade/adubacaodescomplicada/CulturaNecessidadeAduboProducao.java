package com.frazao.adubacaodescomplicada.modelo.entidade.adubacaodescomplicada;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.frazao.adubacaodescomplicada.modelo.dominio.adubacaodescomplicada.ClassificacaoNecessidadeAdubo;
import com.frazao.adubacaodescomplicada.modelo.dominio.adubacaodescomplicada.IdadeUnidade;
import com.frazao.adubacaodescomplicada.modelo.entidade.EntidadeBaseTemId;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity(name = "CulturaNecessidadeAduboProducao")
@Table(schema = "heroku_c7c45a906fc2b28", name = "cultura_necessidade_adubo_producao")
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)

public class CulturaNecessidadeAduboProducao extends EntidadeBaseTemId<Integer> {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cultura_id")
	private Cultura cultura;

	@Column(name = "minimo")
	private BigDecimal minimo;

	@Column(name = "maximo")
	private BigDecimal maximo;

	@Column(name = "nitrogenio")
	private BigDecimal nitrogenio;

	@Column(name = "classificacao")
	@Enumerated(EnumType.STRING)
	private ClassificacaoNecessidadeAdubo classificacao;

	@Column(name = "fosforo")
	private BigDecimal fosforo;

	@Column(name = "potassio")
	private BigDecimal potassio;

	@Column(name = "idade_referencia_min")
	private Integer idadeReferenciaMin;

	@Column(name = "idade_referencia_max")
	private Integer idadeReferenciaMax;

	@Column(name = "idade_unidade")
	@Enumerated(EnumType.STRING)
	private IdadeUnidade idadeUnidade;

	public CulturaNecessidadeAduboProducao(Integer id) {
		super(id);
	}

}
