package com.pupilary.provider.model.domain;

import com.baomidou.mybatisplus.annotation.*;
import com.pupilary.mybatis.model.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author takesi
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName(value = "uac_user")
public class User extends BaseEntity {

    private static final long serialVersionUID = -3448185561176796819L;

    @TableField(value = "username")
    private String username;

    @TableField(value = "password")
    private String password;

    @TableField(value = "nick_name")
    private String nickName;

    @TableField(value = "avatar")
    private String avatar;

    @TableField(value = "full_name")
    private String fullName;

    @TableField(value = "mobile")
    private String mobile;

    @TableField(value = "address")
    private String address;

    @TableField(value = "sex")
    private Short sex;

    @TableLogic(value = "1", delval = "0")
    @TableField(value = "status")
    private Boolean status;
}
