package com.frazao.adubacaodescomplicada.modelo.dto.adubacaodescomplicada;

import java.util.Set;

import com.frazao.adubacaodescomplicada.modelo.dominio.Confirmacao;
import com.frazao.adubacaodescomplicada.modelo.dominio.adubacaodescomplicada.UsuarioPerfil;
import com.frazao.adubacaodescomplicada.modelo.dto.FiltroIdDTO;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class UsuarioFiltroDTO extends FiltroIdDTO {

	private static final long serialVersionUID = 1L;

	private Confirmacao ativo;

	private String email;

	private String login;

	private Set<UsuarioPerfil> perfil;

}
