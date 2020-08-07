package com.frazao.adubacaodescomplicada.modelo.entidade.adubacaodescomplicada;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.frazao.adubacaodescomplicada.modelo.entidade.EntidadeBaseTemId;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity(name = "OauthApprovals")
@Table(name = "oauth_approvals")
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)

public class OauthApprovals extends EntidadeBaseTemId<Integer> {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "clientid")
	private String clientid;

	@Column(name = "expiresat")
	@Basic
	private java.time.LocalDateTime expiresat;

	@Column(name = "lastmodifiedat")
	@Basic
	private java.time.LocalDateTime lastmodifiedat;

	@Column(name = "scope")
	private String scope;

	@Column(name = "status")
	private String status;

	@Column(name = "userid")
	private String userid;

	@Override
	public Integer getId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setId(final Integer id) {
		// TODO Auto-generated method stub

	}

}
