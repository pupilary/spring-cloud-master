package com.pupilary.provider.model.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.pupilary.mybatis.model.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author takesi
 */
@Data
@TableName(value = "uac_role")
@EqualsAndHashCode(callSuper = false)
public class Role extends BaseEntity {

    private static final long serialVersionUID = -4380389809623201274L;

    @TableField(value = "name")
    private String name;

    @TableField(value = "code")
    private String code;

    @TableField(value = "parent_id")
    private Long parentId;

    @TableField(value = "sort")
    private Integer sort;

    @TableField(value = "summary")
    private String summary;

}
