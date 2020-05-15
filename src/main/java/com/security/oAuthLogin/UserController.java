package com.security.oAuthLogin;

import java.util.Map;

import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@GetMapping("/user")
	Map<String,Object> user(OAuth2AuthenticationToken authToken){
		return authToken.getPrincipal().getAttributes();
	}
}
