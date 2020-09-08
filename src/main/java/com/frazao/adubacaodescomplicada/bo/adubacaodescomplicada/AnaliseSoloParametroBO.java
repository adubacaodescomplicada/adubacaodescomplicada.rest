package com.frazao.adubacaodescomplicada.bo.adubacaodescomplicada;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frazao.adubacaodescomplicada.bo.CRUDBO;
import com.frazao.adubacaodescomplicada.dao.adubacaodescomplicada.AnaliseSoloParametroDAO;
import com.frazao.adubacaodescomplicada.modelo.dto.adubacaodescomplicada.AnaliseSoloParametroFiltroDTO;
import com.frazao.adubacaodescomplicada.modelo.entidade.adubacaodescomplicada.AnaliseSoloParametro;

@Service
public class AnaliseSoloParametroBO extends CRUDBO<AnaliseSoloParametro, Integer, AnaliseSoloParametroFiltroDTO, AnaliseSoloParametroDAO> {

   public AnaliseSoloParametroBO(@Autowired AnaliseSoloParametroDAO dao) {
      super(AnaliseSoloParametro.class, dao);
   }

}
