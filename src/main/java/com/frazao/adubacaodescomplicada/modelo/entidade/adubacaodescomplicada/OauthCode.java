package com.frazao.adubacaodescomplicada.modelo.entidade.adubacaodescomplicada;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import com.frazao.adubacaodescomplicada.modelo.entidade.EntidadeBase;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity(name = "OauthCode")
@Table(name = "oauth_code")
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)

public class OauthCode extends EntidadeBase {

	private static final long serialVersionUID = 1L;

	@Column(name = "authentication")
	@Lob
	private byte[] authentication;

	@Id
	@Column(name = "code")
	private String code;

}
