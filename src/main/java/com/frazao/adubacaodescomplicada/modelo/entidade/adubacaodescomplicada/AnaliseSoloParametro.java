package com.frazao.adubacaodescomplicada.modelo.entidade.adubacaodescomplicada;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import com.frazao.adubacaodescomplicada.modelo.dominio.Confirmacao;
import com.frazao.adubacaodescomplicada.modelo.entidade.EntidadeBaseTemId;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity(name = "AnaliseSoloParametro")
@Table(name = "analise_solo_parametro")
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)

public class AnaliseSoloParametro extends EntidadeBaseTemId<Integer> {

	private static final long serialVersionUID = 1L;

	@Column(name = "codigo")
	private String codigo;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;

	@Column(name = "nome")
	private String nome;

	@Column(name = "observacao")
	@Lob
	private String observacao;

	@Column(name = "ordem")
	private Integer ordem;

	@Column(name = "sigla")
	private String sigla;

	@Column(name = "tem_formula_qualidade_solo")
	@Enumerated(EnumType.STRING)
	private Confirmacao temFormulaQualidadeSolo;

	@Column(name = "unidade_medida_lista")
	private String unidadeMedidaLista;

	public AnaliseSoloParametro(Integer id) {
		super(id);
	}

	@SuppressWarnings("unchecked")
	public List<Integer> getUnidadeMedidaLista() {
		return this.unidadeMedidaLista == null ? Collections.EMPTY_LIST
				: Collections.unmodifiableList(new ArrayList<Integer>(Arrays.asList(this.unidadeMedidaLista.split(","))
						.stream().map(e -> new Integer(e)).collect(Collectors.toList())));
	}

	public void setUnidadeMedidaLista(List<Integer> unidadeMedidaLista) {
		this.unidadeMedidaLista = unidadeMedidaLista == null ? null
				: String.join(",",
						unidadeMedidaLista.stream().map(e -> Integer.toString(e)).collect(Collectors.toList()))
						.replaceAll(" ", "");
	}

}
