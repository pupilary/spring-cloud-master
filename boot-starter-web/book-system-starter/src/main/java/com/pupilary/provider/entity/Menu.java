package com.pupilary.provider.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author takesi
 * @date 2021-06-29
 */
@Data
@Entity
@Table(name = "book_menu")
public class Menu implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50)
    private String name;

    @Column(length = 200)
    private String url;

    @Column(name = "parent_id")
    private Long parentId;

    @Column(length = 100)
    private String icon;

    @Column(length = 100)
    private String permissions;

    @Column(length = 10)
    private Integer type;

    @Column(length = 10)
    private Integer sort;

    @Column(name = "div_id", length = 50)
    private String divId;

    @Column(length = 10)
    private Integer state;

}
