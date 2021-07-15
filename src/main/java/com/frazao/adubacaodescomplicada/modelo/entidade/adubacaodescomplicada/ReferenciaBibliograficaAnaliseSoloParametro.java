package com.frazao.adubacaodescomplicada.modelo.entidade.adubacaodescomplicada;

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

@Entity(name = "ReferenciaBibliograficaAnaliseSoloParametro")
@Table(name = "referencia_bibliografica_analise_solo_parametro")
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)

public class ReferenciaBibliograficaAnaliseSoloParametro extends EntidadeBaseTemId<Integer> {

	private static final long serialVersionUID = 1L;

	@ManyToOne()
	@JoinColumn(name = "referencia_bibliografica_id")
	@JsonIgnore
	private ReferenciaBibliografica referenciaBibliografica;

	@ManyToOne()
	@JoinColumn(name = "analise_solo_parametro_id")
	private AnaliseSoloParametro analiseSoloParametro;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;
	
	public ReferenciaBibliograficaAnaliseSoloParametro(Integer id) {
		super(id);
	}

}
