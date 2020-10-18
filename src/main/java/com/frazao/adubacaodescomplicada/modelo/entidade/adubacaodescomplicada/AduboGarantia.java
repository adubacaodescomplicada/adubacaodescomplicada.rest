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

	@ManyToOne
	@JoinColumn(name = "adubo_id")
	private Adubo adubo;

	@ManyToOne
	@JoinColumn(name = "garantia_id")
	private Garantia garantia;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;

	@Column(name = "valor")
	private BigDecimal valor;
	
//	@Column(name = "descricao")
//	private String descricao;
	
	public String toString() {
		return this.getId().toString();
	}

}
