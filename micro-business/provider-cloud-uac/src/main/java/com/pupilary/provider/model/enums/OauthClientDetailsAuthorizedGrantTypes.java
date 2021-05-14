package com.pupilary.provider.model.enums;

import com.baomidou.mybatisplus.annotation.IEnum;
import com.sun.istack.NotNull;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author takesi
 */
public enum OauthClientDetailsAuthorizedGrantTypes implements IEnum<String> {

    /**
     * 授权码
     */
    AUTHORIZATION_CODE {
        @Override
        public String getValue() {
            return "authorization_code";
        }
    },

    /**
     * 密码
     */
    PASSWORD {
        @Override
        public String getValue() {
            return "password";
        }
    },

    /**
     * 刷新令牌
     */
    REFRESH_TOKEN {
        @Override
        public String getValue() {
            return "refresh_token";
        }
    },

    /**
     * 客户端
     */
    CLIENT_CREDENTIALS {
        @Override
        public String getValue() {
            return "client_credentials";
        }
    };

    public static OauthClientDetailsAuthorizedGrantTypes getInstance(String value) {
        for (OauthClientDetailsAuthorizedGrantTypes types : OauthClientDetailsAuthorizedGrantTypes.values()) {
            if (types.getValue().equals(value)) {
                return types;
            }
        }
        throw new IllegalArgumentException("非法参数");
    }

    public static OauthClientDetailsAuthorizedGrantTypes[] getInstances(@NotNull List<String> values) {
       List<OauthClientDetailsAuthorizedGrantTypes> result = values.stream().map(OauthClientDetailsAuthorizedGrantTypes::getInstance).collect(Collectors.toList());
       return null;
    }
}
