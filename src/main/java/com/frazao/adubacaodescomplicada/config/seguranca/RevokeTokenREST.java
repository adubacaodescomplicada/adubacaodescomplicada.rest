package com.frazao.adubacaodescomplicada.config.seguranca;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2RefreshToken;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RevokeTokenREST {

	@Autowired
	private TokenStore tokenStore;

	@PostMapping("/oauth/logout")
	public ResponseEntity<Boolean> revoke(final HttpServletRequest request) {
		try {
			final String authorization = request.getHeader("Authorization");
			if (authorization != null && authorization.contains("Bearer")) {
				final String tokenValue = authorization.replace("Bearer", "").trim();

				final OAuth2AccessToken accessToken = this.tokenStore.readAccessToken(tokenValue);
				if (accessToken != null) {
					this.tokenStore.removeAccessToken(accessToken);

					// OAuth2RefreshToken refreshToken = tokenStore.readRefreshToken(tokenValue);
					final OAuth2RefreshToken refreshToken = accessToken.getRefreshToken();
					if (refreshToken != null) {
						this.tokenStore.removeRefreshToken(refreshToken);
					}
				}
			}
		} catch (final Exception e) {
			return ResponseEntity.badRequest().body(false);
		}

		return ResponseEntity.ok().body(true);
	}

}
