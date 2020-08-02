package com.frazao.adubacaodescomplicada.rest.adubacaodescomplicada;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.frazao.adubacaodescomplicada.rest.CRUDREST;
import com.frazao.adubacaodescomplicada.modelo.entidade.adubacaodescomplicada.OauthApprovals;
import com.frazao.adubacaodescomplicada.bo.adubacaodescomplicada.OauthApprovalsBO;
import com.frazao.adubacaodescomplicada.modelo.dto.adubacaodescomplicada.OauthApprovalsFiltroDTO;

@RestController
@RequestMapping(value = "oauth-approvals")
public class OauthApprovalsCRUDREST extends CRUDREST<OauthApprovals, Integer, OauthApprovalsFiltroDTO, OauthApprovalsBO> {

   public OauthApprovalsCRUDREST(@Autowired OauthApprovalsBO bo) {
      super(bo);
   }

   public OauthApprovalsBO getBO() {
	  return super.getBO();
   }

	@Override
	public OauthApprovals prepararForm(OauthApprovals modelo) throws Exception {
		return modelo == null ? new OauthApprovals() : modelo;
	}

}
