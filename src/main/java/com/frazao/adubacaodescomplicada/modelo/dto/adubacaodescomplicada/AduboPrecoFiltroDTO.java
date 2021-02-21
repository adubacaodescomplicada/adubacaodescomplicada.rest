package com.frazao.adubacaodescomplicada.modelo.dto.adubacaodescomplicada;

import com.frazao.adubacaodescomplicada.modelo.dto.FiltroDTO;
import com.frazao.adubacaodescomplicada.modelo.entidade.adubacaodescomplicada.Adubo;
import com.frazao.adubacaodescomplicada.modelo.entidade.adubacaodescomplicada.UnidadeMedida;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@EqualsAndHashCode

public class AduboPrecoFiltroDTO implements FiltroDTO {

	private static final long serialVersionUID = 1L;

	private Adubo adubo;

	private UnidadeMedida unidadeMedida;

	public AduboPrecoFiltroDTO(Adubo adubo) {
		this.adubo = adubo;
	}

}