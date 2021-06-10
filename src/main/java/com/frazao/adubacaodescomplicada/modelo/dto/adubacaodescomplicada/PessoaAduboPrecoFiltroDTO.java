package com.frazao.adubacaodescomplicada.modelo.dto.adubacaodescomplicada;

import com.frazao.adubacaodescomplicada.modelo.dto.FiltroIdDTO;
import com.frazao.adubacaodescomplicada.modelo.entidade.adubacaodescomplicada.AduboTipo;
import com.frazao.adubacaodescomplicada.modelo.entidade.adubacaodescomplicada.Pessoa;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class PessoaAduboPrecoFiltroDTO extends FiltroIdDTO {

	private static final long serialVersionUID = 1L;
	
	private Pessoa pessoa;
	private AduboTipo aduboTipo;
	private String conteudo;

}
