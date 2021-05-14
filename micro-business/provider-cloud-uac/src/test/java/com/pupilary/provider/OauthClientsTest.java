package com.pupilary.provider;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.crypto.bcrypt.BCrypt;

/**
 * @author takesi
 */
public class OauthClientsTest {

    private static final Logger logger = LoggerFactory.getLogger(OauthClientsTest.class);

    @Test
    public void testGeneratorSecret() {
        String result = BCrypt.hashpw("123456", BCrypt.gensalt());
        logger.info("加密结果: {}", result);
    }

}
