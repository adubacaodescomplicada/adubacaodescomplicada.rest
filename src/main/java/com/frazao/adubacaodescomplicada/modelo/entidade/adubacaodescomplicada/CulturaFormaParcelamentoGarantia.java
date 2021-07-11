package com.frazao.adubacaodescomplicada.modelo.entidade.adubacaodescomplicada;

import java.math.BigDecimal;

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

@Entity(name = "CulturaFormaParcelamentoGarantia")
@Table(name = "cultura_forma_parcelamento_garantia")
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class CulturaFormaParcelamentoGarantia extends EntidadeBaseTemId<Integer> {

	private static final long serialVersionUID = 1L;

	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "cultura_forma_parcelamento_id")
	private CulturaFormaParcelamento culturaFormaParcelamento;

	@ManyToOne
	@JoinColumn(name = "garantia_id")
	private Garantia garantia;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;

	@Column(name = "quantidade")
	private BigDecimal quantidade;

	public CulturaFormaParcelamentoGarantia(Integer id) {
		super(id);
	}

}
