package com.frazao.adubacaodescomplicada.bo.adubacaodescomplicada;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frazao.adubacaodescomplicada.bo.CRUDBO;
import com.frazao.adubacaodescomplicada.dao.adubacaodescomplicada.OauthCodeDAO;
import com.frazao.adubacaodescomplicada.modelo.dto.adubacaodescomplicada.OauthCodeFiltroDTO;
import com.frazao.adubacaodescomplicada.modelo.entidade.adubacaodescomplicada.OauthCode;

@Service
public class OauthCodeBO extends CRUDBO<OauthCode, Integer, OauthCodeFiltroDTO, OauthCodeDAO> {

   public OauthCodeBO(@Autowired OauthCodeDAO dao) {
      super(OauthCode.class, dao);
   }

}

