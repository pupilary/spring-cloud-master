package com.pupilary.auth.client.handler;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.oauth2.provider.error.OAuth2AccessDeniedHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 处理spring security 权限不足返回数据格式
 *
 * @author takesi
 */
@Component
@ConditionalOnMissingClass
public class Oauth2AccessDeniedHandler extends OAuth2AccessDeniedHandler {

    @Override
    public void handle(HttpServletRequest request, HttpServletResponse response, AccessDeniedException authException) throws IOException, ServletException {
        super.handle(request, response, authException);
    }
}
