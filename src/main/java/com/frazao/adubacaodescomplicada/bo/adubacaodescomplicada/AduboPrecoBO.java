package com.frazao.adubacaodescomplicada.bo.adubacaodescomplicada;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frazao.adubacaodescomplicada.bo.CRUDBO;
import com.frazao.adubacaodescomplicada.dao.adubacaodescomplicada.AduboPrecoDAO;
import com.frazao.adubacaodescomplicada.modelo.dto.adubacaodescomplicada.AduboPrecoFiltroDTO;
import com.frazao.adubacaodescomplicada.modelo.entidade.adubacaodescomplicada.AduboPreco;

@Service
public class AduboPrecoBO extends CRUDBO<AduboPreco, java.lang.Integer, AduboPrecoFiltroDTO, AduboPrecoDAO> {

   public AduboPrecoBO(@Autowired AduboPrecoDAO dao) {
      super(AduboPreco.class, dao);
   }

}

