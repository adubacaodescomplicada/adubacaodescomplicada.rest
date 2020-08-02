package com.frazao.adubacaodescomplicada.bo.adubacaodescomplicada;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frazao.adubacaodescomplicada.bo.CRUDBO;
import com.frazao.adubacaodescomplicada.dao.adubacaodescomplicada.EnderecoDAO;
import com.frazao.adubacaodescomplicada.modelo.dto.adubacaodescomplicada.EnderecoFiltroDTO;
import com.frazao.adubacaodescomplicada.modelo.entidade.adubacaodescomplicada.Endereco;

@Service
public class EnderecoBO extends CRUDBO<Endereco, java.lang.Integer, EnderecoFiltroDTO, EnderecoDAO> {

   public EnderecoBO(@Autowired EnderecoDAO dao) {
      super(Endereco.class, dao);
   }

}

