package com.frazao.adubacaodescomplicada.bo.adubacaodescomplicada;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frazao.adubacaodescomplicada.bo.CRUDBO;
import com.frazao.adubacaodescomplicada.dao.adubacaodescomplicada.CulturaDAO;
import com.frazao.adubacaodescomplicada.modelo.dto.adubacaodescomplicada.CulturaFiltroDTO;
import com.frazao.adubacaodescomplicada.modelo.entidade.adubacaodescomplicada.Cultura;

@Service
public class CulturaBO extends CRUDBO<Cultura, java.lang.Integer, CulturaFiltroDTO, CulturaDAO> {

   public CulturaBO(@Autowired CulturaDAO dao) {
      super(Cultura.class, dao);
   }

}

