package com.byoryn.entity;

import com.byoryn.base.BaseEntity;

import javax.persistence.Column;

/**
 * @author panguangze
 * @data 2019/10/31
 */
public class PanelEntity extends BaseEntity {

    public PanelEntity() {

    }

    private String name;
    @Column(name = "create_user_id")
    private int CreateUserId;
    @Column(columnDefinition = "TEXT")
    private String data;
}