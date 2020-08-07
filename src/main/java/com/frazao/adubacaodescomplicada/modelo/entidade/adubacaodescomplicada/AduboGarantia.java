package com.frazao.adubacaodescomplicada.modelo.entidade.adubacaodescomplicada;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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

@Entity(name = "AduboGarantia")
@Table(name = "adubo_garantia")
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)

public class AduboGarantia extends EntidadeBaseTemId<Integer> {

	private static final long serialVersionUID = 1L;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "adubo_id")
	private com.frazao.adubacaodescomplicada.modelo.entidade.adubacaodescomplicada.AduboGarantia aduboId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "garantia_id")
	private com.frazao.adubacaodescomplicada.modelo.entidade.adubacaodescomplicada.AduboGarantia garantiaId;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;

	@Column(name = "valor")
	private BigDecimal valor;

}
