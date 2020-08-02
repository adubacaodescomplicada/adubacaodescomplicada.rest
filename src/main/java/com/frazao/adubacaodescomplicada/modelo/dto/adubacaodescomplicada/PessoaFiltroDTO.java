package com.frazao.adubacaodescomplicada.modelo.dto.adubacaodescomplicada;

import java.util.HashSet;
import java.util.Set;

import com.frazao.adubacaodescomplicada.modelo.dominio.adubacaodescomplicada.PessoaTipo;
import com.frazao.adubacaodescomplicada.modelo.dto.FiltroIdDTO;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class PessoaFiltroDTO extends FiltroIdDTO {

	private static final long serialVersionUID = 1L;

	private String cpfCnpj;

	private String nome;

	private Set<PessoaTipo> pessoaTipo = new HashSet<>();

}
