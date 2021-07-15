package com.frazao.adubacaodescomplicada.modelo.entidade.adubacaodescomplicada;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.frazao.adubacaodescomplicada.modelo.entidade.EntidadeBaseTemId;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity(name = "ReferenciaBibliografica")
@Table(name = "referencia_bibliografica")
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)

public class ReferenciaBibliografica extends EntidadeBaseTemId<Integer> {

	private static final long serialVersionUID = 1L;

	@OneToMany(mappedBy = "referenciaBibliografica")
	private List<ReferenciaBibliograficaAnaliseSoloParametro> referenciaBibliograficaAnaliseSoloParametroList = new ArrayList<>();

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;

	@Column(name = "nome")
	private String nome;

	public ReferenciaBibliografica(Integer id) {
		super(id);
	}

}
