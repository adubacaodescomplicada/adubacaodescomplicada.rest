package com.frazao.adubacaodescomplicada.bo.adubacaodescomplicada;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frazao.adubacaodescomplicada.bo.CRUDBO;
import com.frazao.adubacaodescomplicada.dao.adubacaodescomplicada.AduboTipoDAO;
import com.frazao.adubacaodescomplicada.modelo.dto.adubacaodescomplicada.AduboTipoFiltroDTO;
import com.frazao.adubacaodescomplicada.modelo.entidade.adubacaodescomplicada.AduboTipo;

@Service
public class AduboTipoBO extends CRUDBO<AduboTipo, java.lang.Integer, AduboTipoFiltroDTO, AduboTipoDAO> {

   public AduboTipoBO(@Autowired AduboTipoDAO dao) {
      super(AduboTipo.class, dao);
   }

}

