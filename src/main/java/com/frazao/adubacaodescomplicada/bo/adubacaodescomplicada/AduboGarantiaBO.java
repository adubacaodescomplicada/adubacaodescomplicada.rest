package com.frazao.adubacaodescomplicada.bo.adubacaodescomplicada;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frazao.adubacaodescomplicada.bo.CRUDBO;
import com.frazao.adubacaodescomplicada.dao.adubacaodescomplicada.AduboGarantiaDAO;
import com.frazao.adubacaodescomplicada.modelo.dto.adubacaodescomplicada.AduboGarantiaFiltroDTO;
import com.frazao.adubacaodescomplicada.modelo.entidade.adubacaodescomplicada.AduboGarantia;

@Service
public class AduboGarantiaBO extends CRUDBO<AduboGarantia, java.lang.Integer, AduboGarantiaFiltroDTO, AduboGarantiaDAO> {

   public AduboGarantiaBO(@Autowired AduboGarantiaDAO dao) {
      super(AduboGarantia.class, dao);
   }

}

