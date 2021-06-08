package com.frazao.adubacaodescomplicada.rest.adubacaodescomplicada;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.frazao.adubacaodescomplicada.rest.CRUDREST;
import com.frazao.adubacaodescomplicada.modelo.entidade.adubacaodescomplicada.Pessoa;
import com.frazao.adubacaodescomplicada.bo.adubacaodescomplicada.PessoaBO;
import com.frazao.adubacaodescomplicada.modelo.dto.adubacaodescomplicada.PessoaFiltroDTO;

@RestController
@RequestMapping(value = "pessoa")
public class PessoaCRUDREST extends CRUDREST<Pessoa, java.lang.Integer, PessoaFiltroDTO, PessoaBO> {

   public PessoaCRUDREST(@Autowired PessoaBO bo) {
      super(bo);
   }

   public PessoaBO getBO() {
	  return super.getBO();
   }

	@Override
	public Pessoa prepararForm(Pessoa modelo, Principal usuario) throws Exception {
		return modelo == null ? new Pessoa() : modelo;
	}

}
