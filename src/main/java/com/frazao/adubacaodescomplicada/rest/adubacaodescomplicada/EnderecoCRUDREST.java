package com.frazao.adubacaodescomplicada.rest.adubacaodescomplicada;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.frazao.adubacaodescomplicada.rest.CRUDREST;
import com.frazao.adubacaodescomplicada.modelo.entidade.adubacaodescomplicada.Endereco;
import com.frazao.adubacaodescomplicada.bo.adubacaodescomplicada.EnderecoBO;
import com.frazao.adubacaodescomplicada.modelo.dto.adubacaodescomplicada.EnderecoFiltroDTO;

@RestController
@RequestMapping(value = "endereco")
public class EnderecoCRUDREST extends CRUDREST<Endereco, java.lang.Integer, EnderecoFiltroDTO, EnderecoBO> {

   public EnderecoCRUDREST(@Autowired EnderecoBO bo) {
      super(bo);
   }

   public EnderecoBO getBO() {
	  return super.getBO();
   }

	@Override
	public Endereco prepararForm(Endereco modelo) throws Exception {
		return modelo == null ? new Endereco() : modelo;
	}

}
