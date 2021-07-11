package com.frazao.adubacaodescomplicada.modelo.entidade.adubacaodescomplicada;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.frazao.adubacaodescomplicada.modelo.entidade.EntidadeBaseTemId;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity(name = "CulturaFormaParcelamento")
@Table(name = "cultura_forma_parcelamento")
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class CulturaFormaParcelamento extends EntidadeBaseTemId<Integer> {

	private static final long serialVersionUID = 1L;

	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "cultura_id")
	private Cultura cultura;

	@OneToMany(mappedBy = "culturaFormaParcelamento")
	private List<CulturaFormaParcelamentoGarantia> culturaFormaParcelamentoGarantiaList = new ArrayList<>();

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;

	@Column(name = "ordem")
	private Integer ordem;

	@Column(name = "periodo_final")
	private Integer periodoFinal;
	
	@Column(name = "periodo_inicial")
	private Integer periodoInicial;

	public CulturaFormaParcelamento(Integer id) {
		super(id);
	}

}
