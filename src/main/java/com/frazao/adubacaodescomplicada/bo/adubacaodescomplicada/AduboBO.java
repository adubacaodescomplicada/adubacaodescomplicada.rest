package com.frazao.adubacaodescomplicada.bo.adubacaodescomplicada;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frazao.adubacaodescomplicada.bo.CRUDBO;
import com.frazao.adubacaodescomplicada.dao.adubacaodescomplicada.AduboDAO;
import com.frazao.adubacaodescomplicada.modelo.dto.adubacaodescomplicada.AduboFiltroDTO;
import com.frazao.adubacaodescomplicada.modelo.entidade.adubacaodescomplicada.Adubo;

@Service
public class AduboBO extends CRUDBO<Adubo, java.lang.Integer, AduboFiltroDTO, AduboDAO> {

   public AduboBO(@Autowired AduboDAO dao) {
      super(Adubo.class, dao);
   }

}

