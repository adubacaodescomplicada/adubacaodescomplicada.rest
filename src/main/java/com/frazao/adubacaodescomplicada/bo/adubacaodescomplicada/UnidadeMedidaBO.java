package com.frazao.adubacaodescomplicada.bo.adubacaodescomplicada;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frazao.adubacaodescomplicada.bo.CRUDBO;
import com.frazao.adubacaodescomplicada.dao.adubacaodescomplicada.UnidadeMedidaDAO;
import com.frazao.adubacaodescomplicada.modelo.dto.adubacaodescomplicada.UnidadeMedidaFiltroDTO;
import com.frazao.adubacaodescomplicada.modelo.entidade.adubacaodescomplicada.UnidadeMedida;

@Service
public class UnidadeMedidaBO extends CRUDBO<UnidadeMedida, java.lang.Integer, UnidadeMedidaFiltroDTO, UnidadeMedidaDAO> {

   public UnidadeMedidaBO(@Autowired UnidadeMedidaDAO dao) {
      super(UnidadeMedida.class, dao);
   }

}

