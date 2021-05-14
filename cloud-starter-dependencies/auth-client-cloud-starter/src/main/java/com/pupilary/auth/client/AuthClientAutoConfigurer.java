package com.pupilary.auth.client;

import org.springframework.boot.CommandLineRunner;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

/**
 * @author takesi
 */
@EnableResourceServer
public class AuthClientAutoConfigurer extends ResourceServerConfigurerAdapter implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {

    }
}
