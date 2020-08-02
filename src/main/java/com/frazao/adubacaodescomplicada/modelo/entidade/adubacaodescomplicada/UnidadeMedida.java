package com.frazao.adubacaodescomplicada.modelo.entidade.adubacaodescomplicada;

import java.math.BigDecimal;
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
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.frazao.adubacaodescomplicada.modelo.entidade.EntidadeBaseTemId;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity(name = "UnidadeMedida")
@Table(schema = "adubacaodescomplicada", name = "unidade_medida")
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)

public class UnidadeMedida extends EntidadeBaseTemId<Integer> {

	private static final long serialVersionUID = 1L;

	@Column(name = "base")
	@Enumerated(EnumType.STRING)
	private com.frazao.adubacaodescomplicada.modelo.dominio.Confirmacao base;

	@Column(name = "codigo")
	private String codigo;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;

	@Column(name = "nome")
	private String nome;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "pai_id")
	private com.frazao.adubacaodescomplicada.modelo.entidade.adubacaodescomplicada.UnidadeMedida paiId;

	@Transient
	private List<UnidadeMedida> unidadeMedidaList;

	@Column(name = "valor_base")
	private BigDecimal valorBase;

}
