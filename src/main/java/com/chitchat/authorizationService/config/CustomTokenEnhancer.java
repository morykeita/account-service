/**
 * 
 */
package com.chitchat.authorizationService.config;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;

import com.chitchat.authorizationService.entity.User;



/**
 * @author Mory Keita
	Mar 2, 2019
 *
 */
public class CustomTokenEnhancer extends JwtAccessTokenConverter {
	@Override
	public OAuth2AccessToken enhance(OAuth2AccessToken accessToken, OAuth2Authentication authentication) {
		User user = (User) authentication.getPrincipal();

		Map<String, Object> info = new LinkedHashMap<String, Object>(accessToken.getAdditionalInformation());

		info.put("email", user.getEmail());
		info.put("username", user.getUsername());
		info.put("country",user.getCountry());
		info.put("is_2fa_enabled",user.isTfa_Enabled());
		info.put("2fa_default_type",user.getTfa_default_type());


		DefaultOAuth2AccessToken customAccessToken = new DefaultOAuth2AccessToken(accessToken);
		customAccessToken.setAdditionalInformation(info);

		return super.enhance(customAccessToken, authentication);
	}
}
