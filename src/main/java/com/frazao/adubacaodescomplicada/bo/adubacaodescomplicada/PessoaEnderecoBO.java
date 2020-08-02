package com.frazao.adubacaodescomplicada.bo.adubacaodescomplicada;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frazao.adubacaodescomplicada.bo.CRUDBO;
import com.frazao.adubacaodescomplicada.dao.adubacaodescomplicada.PessoaEnderecoDAO;
import com.frazao.adubacaodescomplicada.modelo.dto.adubacaodescomplicada.PessoaEnderecoFiltroDTO;
import com.frazao.adubacaodescomplicada.modelo.entidade.adubacaodescomplicada.PessoaEndereco;

@Service
public class PessoaEnderecoBO extends CRUDBO<PessoaEndereco, java.lang.Integer, PessoaEnderecoFiltroDTO, PessoaEnderecoDAO> {

   public PessoaEnderecoBO(@Autowired PessoaEnderecoDAO dao) {
      super(PessoaEndereco.class, dao);
   }

}

