package com.frazao.adubacaodescomplicada.bo.adubacaodescomplicada;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frazao.adubacaodescomplicada.bo.CRUDBO;
import com.frazao.adubacaodescomplicada.dao.adubacaodescomplicada.PessoaDAO;
import com.frazao.adubacaodescomplicada.modelo.dto.adubacaodescomplicada.PessoaFiltroDTO;
import com.frazao.adubacaodescomplicada.modelo.entidade.adubacaodescomplicada.Pessoa;

@Service
public class PessoaBO extends CRUDBO<Pessoa, java.lang.Integer, PessoaFiltroDTO, PessoaDAO> {

   public PessoaBO(@Autowired PessoaDAO dao) {
      super(Pessoa.class, dao);
   }
   
   @Transactional
   public void iniciaPrecoAdubo(Pessoa pessoa) {
	   this.getDAO().iniciaPrecoAdubo(pessoa);
   }

}

