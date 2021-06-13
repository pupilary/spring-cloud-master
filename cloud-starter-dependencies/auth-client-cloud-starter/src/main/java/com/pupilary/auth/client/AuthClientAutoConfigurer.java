package com.pupilary.auth.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.error.OAuth2AccessDeniedHandler;
import org.springframework.security.oauth2.provider.token.TokenStore;

import javax.annotation.Resource;

/**
 * @author takesi
 */
public class AuthClientAutoConfigurer extends ResourceServerConfigurerAdapter {

    @Autowired
    private TokenStore tokenStore;
    @Resource
    private OAuth2AccessDeniedHandler oAuth2AccessDeniedHandler;

    @Override
    public void configure(ResourceServerSecurityConfigurer resources) throws Exception {
        resources.tokenStore(tokenStore)
                .stateless(true)
                .accessDeniedHandler(oAuth2AccessDeniedHandler);
    }

    /**
     * 留给子类重写扩展功能
     *
     * @param http http
     * @return HttpSecurity
     */
    protected HttpSecurity setHttpSecurity(HttpSecurity http) {
        return http;
    }
}
