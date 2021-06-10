package com.frazao.adubacaodescomplicada.rest.adubacaodescomplicada;

import java.security.Principal;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.frazao.adubacaodescomplicada.bo.adubacaodescomplicada.PessoaAduboPrecoBO;
import com.frazao.adubacaodescomplicada.modelo.dto.adubacaodescomplicada.PessoaAduboPrecoFiltroDTO;
import com.frazao.adubacaodescomplicada.modelo.entidade.adubacaodescomplicada.Pessoa;
import com.frazao.adubacaodescomplicada.modelo.entidade.adubacaodescomplicada.PessoaAduboPreco;
import com.frazao.adubacaodescomplicada.rest.CRUDREST;

@RestController
@RequestMapping(value = "pessoa-adubo-preco")
public class PessoaAduboPrecoCRUDREST
		extends CRUDREST<PessoaAduboPreco, Integer, PessoaAduboPrecoFiltroDTO, PessoaAduboPrecoBO> {

	public PessoaAduboPrecoCRUDREST(@Autowired PessoaAduboPrecoBO bo) {
		super(bo);
	}

	public PessoaAduboPrecoBO getBO() {
		return super.getBO();
	}

	@Override
	public PessoaAduboPreco prepararForm(PessoaAduboPreco modelo, Principal usuario) throws Exception {
		return modelo == null ? new PessoaAduboPreco() : modelo;
	}

	@PostMapping("/salvar")
	public Integer save(final Pessoa pessoa,
			@RequestBody final Collection<PessoaAduboPreco> t, Principal usuario) throws Exception {
		final Integer result = this.getBO().createAll(pessoa, t, usuario);
		return result;
	}

}
