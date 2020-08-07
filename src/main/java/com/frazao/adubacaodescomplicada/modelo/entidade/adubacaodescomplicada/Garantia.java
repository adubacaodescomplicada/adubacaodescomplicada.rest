package com.frazao.adubacaodescomplicada.modelo.entidade.adubacaodescomplicada;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.frazao.adubacaodescomplicada.modelo.entidade.EntidadeBaseTemId;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity(name = "Garantia")
@Table(name = "garantia")
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)

public class Garantia extends EntidadeBaseTemId<Integer> {

	private static final long serialVersionUID = 1L;

	@Transient
	private List<AduboGarantia> aduboGarantiaList;

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

}
