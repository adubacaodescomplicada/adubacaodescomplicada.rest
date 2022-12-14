package com.frazao.adubacaodescomplicada.config.seguranca;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.TokenEnhancer;
import org.springframework.stereotype.Component;

import com.frazao.adubacaodescomplicada.bo.adubacaodescomplicada.PessoaBO;
import com.frazao.adubacaodescomplicada.bo.adubacaodescomplicada.UsuarioBO;
import com.frazao.adubacaodescomplicada.modelo.entidade.adubacaodescomplicada.Usuario;

@Component
public class TokenEnhancerConfig implements TokenEnhancer {

	@Autowired
	private UsuarioBO bo;
	
	@Autowired
	private PessoaBO pessoaBo;

	public TokenEnhancerConfig() {
	}

	@SuppressWarnings("unchecked")
	@Override
	public OAuth2AccessToken enhance(final OAuth2AccessToken accessToken, final OAuth2Authentication authentication) {
		final DefaultOAuth2AccessToken tempResult = (DefaultOAuth2AccessToken) accessToken;

		Map<String, Object> details = new HashMap<>();
		Object userDetails = null;
		if (authentication.getUserAuthentication() != null
				&& authentication.getUserAuthentication().getDetails() != null) {
			userDetails = authentication.getUserAuthentication().getDetails();
		}
		if (userDetails != null) {
			details = (Map<String, Object>) userDetails;
		}

		if (authentication.getUserAuthentication() != null) {			
			final Usuario usuario = this.bo.findByLogin(authentication.getUserAuthentication().getName());
			details.put("nome", usuario.getPessoa().isPresent() ? usuario.getPessoa().get().getNome() : usuario.getLogin());
			details.put("pessoa_id", usuario.getPessoa().isPresent() ? usuario.getPessoa().get().getId() : null);
			details.put("foto", usuario.getFoto());
			details.put("email", usuario.getEmail());
			details.put("perfil", usuario.getPerfil());
			tempResult.setAdditionalInformation(details);
			
			// iniciar tabela de pre??os do usu??rio
			usuario.getPessoa().ifPresent(p -> pessoaBo.iniciaPrecoAdubo(p));
		}

		return tempResult;
	}

}
