package com.frazao.adubacaodescomplicada.modelo.entidade;

import java.io.Serializable;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@EqualsAndHashCode
public abstract class EntidadeBase implements Serializable {

	private static final long serialVersionUID = 1L;

}
