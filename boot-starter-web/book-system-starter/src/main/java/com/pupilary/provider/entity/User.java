package com.pupilary.provider.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

/**
 * @author takesi
 * @date 2021-06-29
 */
@Data
@Entity
@Table(name = "book_user")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 30)
    @NotBlank(message = "用户名不能为空")
    private String name;

    @Column(length = 200)
    private String password;

    @Column(length = 200)
    private String avatar;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;

    @NotBlank(message = "真实姓名不能为空")
    @Column(name = "true_name", length = 200)
    private String trueName;

    @NotNull(message = "排序号不能为空")
    @Column(length = 10)
    private Integer sort;

    @Column(name = "create_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createTime;

    @Column(name = "update_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateTime;

    @Column(length = 200)
    private String remark;

}
