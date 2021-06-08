package com.frazao.adubacaodescomplicada.rest.adubacaodescomplicada;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.frazao.adubacaodescomplicada.bo.adubacaodescomplicada.AduboPrecoBO;
import com.frazao.adubacaodescomplicada.modelo.dto.adubacaodescomplicada.AduboPrecoFiltroDTO;
import com.frazao.adubacaodescomplicada.modelo.entidade.adubacaodescomplicada.AduboPreco;
import com.frazao.adubacaodescomplicada.rest.CRUDREST;

@RestController
@RequestMapping(value = "adubo-preco")
public class AduboPrecoCRUDREST extends CRUDREST<AduboPreco, java.lang.Integer, AduboPrecoFiltroDTO, AduboPrecoBO> {

   public AduboPrecoCRUDREST(@Autowired AduboPrecoBO bo) {
      super(bo);
   }

	@Override
	public AduboPreco prepararForm(AduboPreco modelo, Principal usuario) throws Exception {
		return modelo == null ? new AduboPreco() : modelo;
	}

}
