package com.frazao.adubacaodescomplicada.bo.adubacaodescomplicada;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frazao.adubacaodescomplicada.bo.CRUDBO;
import com.frazao.adubacaodescomplicada.dao.adubacaodescomplicada.OauthApprovalsDAO;
import com.frazao.adubacaodescomplicada.modelo.dto.adubacaodescomplicada.OauthApprovalsFiltroDTO;
import com.frazao.adubacaodescomplicada.modelo.entidade.adubacaodescomplicada.OauthApprovals;

@Service
public class OauthApprovalsBO extends CRUDBO<OauthApprovals, Integer, OauthApprovalsFiltroDTO, OauthApprovalsDAO> {

   public OauthApprovalsBO(@Autowired OauthApprovalsDAO dao) {
      super(OauthApprovals.class, dao);
   }

}

