package com.frazao.adubacaodescomplicada.bo.adubacaodescomplicada;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frazao.adubacaodescomplicada.bo.CRUDBO;
import com.frazao.adubacaodescomplicada.dao.adubacaodescomplicada.GarantiaDAO;
import com.frazao.adubacaodescomplicada.modelo.dto.adubacaodescomplicada.GarantiaFiltroDTO;
import com.frazao.adubacaodescomplicada.modelo.entidade.adubacaodescomplicada.Garantia;

@Service
public class GarantiaBO extends CRUDBO<Garantia, java.lang.Integer, GarantiaFiltroDTO, GarantiaDAO> {

   public GarantiaBO(@Autowired GarantiaDAO dao) {
      super(Garantia.class, dao);
   }

}
