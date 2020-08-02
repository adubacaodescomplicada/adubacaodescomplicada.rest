package com.frazao.adubacaodescomplicada.modelo.dto.adubacaodescomplicada;

import javax.validation.constraints.NotBlank;

import com.frazao.adubacaodescomplicada.modelo.dto.DTO;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@EqualsAndHashCode

public class RecuperarSenhaDTO implements DTO {

	private static final long serialVersionUID = 1L;

	@NotBlank
	private String email;

	public RecuperarSenhaDTO(final String email) {
		this.setEmail(email);
	}

}
