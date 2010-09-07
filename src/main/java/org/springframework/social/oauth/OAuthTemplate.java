package org.springframework.social.oauth;

import java.net.URL;
import java.util.Map;

import org.springframework.http.HttpMethod;

public interface OAuthTemplate {
	String buildAuthorizationHeader(HttpMethod method, URL url, Map<String, String> parameters);
}
