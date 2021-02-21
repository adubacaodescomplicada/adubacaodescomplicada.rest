package com.frazao.adubacaodescomplicada.modelo.entidade.adubacaodescomplicada;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import com.frazao.adubacaodescomplicada.modelo.entidade.EntidadeBaseTemId;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity(name = "CulturaAnaliseSoloParametro")
@Table(schema = "heroku_c7c45a906fc2b28", name = "cultura_analise_solo_parametro")
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class CulturaAnaliseSoloParametro extends EntidadeBaseTemId<Integer> {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;

	@JoinColumn(name = "cultura_id")
	private Cultura cultura;

	@JoinColumn(name = "analise_solo_parametro_id")
	private AnaliseSoloParametro analiseSoloParametro;
	
	public CulturaAnaliseSoloParametro(Integer id) {
		super(id);
	}

}
