package com.frazao.adubacaodescomplicada.modelo.entidade.adubacaodescomplicada;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.frazao.adubacaodescomplicada.modelo.entidade.EntidadeBaseTemId;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity(name = "FonteMateriaOrganica")
@Table(name = "fonte_materia_organica")
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class FonteMateriaOrganica extends EntidadeBaseTemId<Integer> {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;

	@Column(name = "codigo")
	private String codigo;

	@Column(name = "nome")
	private String nome;

	@Column(name = "quantidade_quilo_cova")
	private BigDecimal quantidadeQuiloCova;

}
