package com.frazao.adubacaodescomplicada.modelo.entidade.adubacaodescomplicada;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.frazao.adubacaodescomplicada.modelo.entidade.EntidadeBaseTemId;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity(name = "AduboTipo")
@Table(schema = "adubacaodescomplicada", name = "adubo_tipo")
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)

public class AduboTipo extends EntidadeBaseTemId<Integer> {

	private static final long serialVersionUID = 1L;

	@Transient
	private List<Adubo> aduboList;

	@Column(name = "codigo")
	private String codigo;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;

	@Column(name = "nome")
	private String nome;

}
