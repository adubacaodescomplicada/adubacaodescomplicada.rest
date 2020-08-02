package com.frazao.adubacaodescomplicada.modelo.entidade.adubacaodescomplicada;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import com.frazao.adubacaodescomplicada.modelo.entidade.EntidadeBaseTemId;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity(name = "OauthRefreshToken")
@Table(schema = "adubacaodescomplicada", name = "oauth_refresh_token")
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)

public class OauthRefreshToken extends EntidadeBaseTemId<Integer> {

	private static final long serialVersionUID = 1L;

	@Column(name = "authentication")
	@Lob
	private byte[] authentication;

	@Column(name = "token")
	@Lob
	private byte[] token;

	@Id
	@Column(name = "token_id")
	private String tokenId;

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
