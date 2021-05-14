package com.pupilary.provider.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.pupilary.mybatis.model.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

@Data
@EqualsAndHashCode(callSuper = false)
@TableName(value = "oauth_client_details")
public class OauthClientDetails extends BaseEntity {

    /**
     * 主键id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 应用标识
     */
    @TableField(value = "client_id")
    private String clientId;

    /**
     * 应用名称
     */
    @TableField(value = "client_name")
    private String clientName;

    /**
     * 资源限定串(逗号分割)
     */
    @TableField(value = "resource_ids")
    private String resourceIds;

    /**
     * 应用密钥(bcyt) 加密
     */
    @TableField(value = "client_secret")
    private String clientSecret;

    /**
     * 应用密钥(明文)
     */
    @TableField(value = "client_secret_str")
    private String clientSecretStr;

    /**
     * 范围
     */
    @TableField(value = "`scope`")
    private String scope;

    /**
     * 5种oauth授权方式(authorization_code,password,refresh_token,client_credentials)
     */
    @TableField(value = "authorized_grant_types")
    private String authorizedGrantTypes;

    /**
     * 回调地址
     */
    @TableField(value = "web_server_redirect_uri")
    private String webServerRedirectUri;

    /**
     * 权限
     */
    @TableField(value = "authorities")
    private String authorities;

    /**
     * access_token有效期
     */
    @TableField(value = "access_token_validity")
    private Integer accessTokenValidity;

    /**
     * refresh_token有效期
     */
    @TableField(value = "refresh_token_validity")
    private Integer refreshTokenValidity;

    /**
     * {}
     */
    @TableField(value = "additional_information")
    private String additionalInformation;

    /**
     * 是否自动授权
     */
    @TableField(value = "autoapprove")
    private String autoapprove;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private Date createTime;

    /**
     * 更新时间
     */
    @TableField(value = "update_time")
    private Date updateTime;

    /**
     * 版本号
     */
    @TableField(value = "version")
    private Integer version;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_CLIENT_ID = "client_id";

    public static final String COL_CLIENT_NAME = "client_name";

    public static final String COL_RESOURCE_IDS = "resource_ids";

    public static final String COL_CLIENT_SECRET = "client_secret";

    public static final String COL_CLIENT_SECRET_STR = "client_secret_str";

    public static final String COL_SCOPE = "scope";

    public static final String COL_AUTHORIZED_GRANT_TYPES = "authorized_grant_types";

    public static final String COL_WEB_SERVER_REDIRECT_URI = "web_server_redirect_uri";

    public static final String COL_AUTHORITIES = "authorities";

    public static final String COL_ACCESS_TOKEN_VALIDITY = "access_token_validity";

    public static final String COL_REFRESH_TOKEN_VALIDITY = "refresh_token_validity";

    public static final String COL_ADDITIONAL_INFORMATION = "additional_information";

    public static final String COL_AUTOAPPROVE = "autoapprove";

    public static final String COL_CREATE_TIME = "create_time";

    public static final String COL_UPDATE_TIME = "update_time";

    public static final String COL_VERSION = "version";
}