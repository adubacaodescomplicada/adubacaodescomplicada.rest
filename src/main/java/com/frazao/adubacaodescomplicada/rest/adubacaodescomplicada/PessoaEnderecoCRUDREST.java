package com.frazao.adubacaodescomplicada.rest.adubacaodescomplicada;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.frazao.adubacaodescomplicada.rest.CRUDREST;
import com.frazao.adubacaodescomplicada.modelo.entidade.adubacaodescomplicada.PessoaEndereco;
import com.frazao.adubacaodescomplicada.bo.adubacaodescomplicada.PessoaEnderecoBO;
import com.frazao.adubacaodescomplicada.modelo.dto.adubacaodescomplicada.PessoaEnderecoFiltroDTO;

@RestController
@RequestMapping(value = "pessoa-endereco")
public class PessoaEnderecoCRUDREST extends CRUDREST<PessoaEndereco, java.lang.Integer, PessoaEnderecoFiltroDTO, PessoaEnderecoBO> {

   public PessoaEnderecoCRUDREST(@Autowired PessoaEnderecoBO bo) {
      super(bo);
   }

   public PessoaEnderecoBO getBO() {
	  return super.getBO();
   }

	@Override
	public PessoaEndereco prepararForm(PessoaEndereco modelo) throws Exception {
		return modelo == null ? new PessoaEndereco() : modelo;
	}

}
