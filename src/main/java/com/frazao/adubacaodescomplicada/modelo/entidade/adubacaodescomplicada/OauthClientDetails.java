package com.frazao.adubacaodescomplicada.modelo.entidade.adubacaodescomplicada;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.frazao.adubacaodescomplicada.modelo.entidade.EntidadeBaseTemId;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity(name = "OauthClientDetails")
@Table(schema = "adubacaodescomplicada", name = "oauth_client_details")
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)

public class OauthClientDetails extends EntidadeBaseTemId<Integer> {

	private static final long serialVersionUID = 1L;

	@Column(name = "access_token_validity")
	private Integer accessTokenValidity;

	@Column(name = "additional_information")
	private String additionalInformation;

	@Column(name = "authorities")
	private String authorities;

	@Column(name = "authorized_grant_types")
	private String authorizedGrantTypes;

	@Column(name = "autoapprove")
	private String autoapprove;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "client_id")
	private String clientId;

	@Column(name = "client_secret")
	private String clientSecret;

	@Column(name = "refresh_token_validity")
	private Integer refreshTokenValidity;

	@Column(name = "resource_ids")
	private String resourceIds;

	@Column(name = "scope")
	private String scope;

	@Column(name = "web_server_redirect_uri")
	private String webServerRedirectUri;

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
