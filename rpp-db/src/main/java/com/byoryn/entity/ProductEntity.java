package com.byoryn.entity;

import com.byoryn.base.BaseEntity;
import com.byoryn.utils.TypeEnumConverter;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * @author panguangze
 * @data 2019/10/31
 */
public class ProductEntity extends BaseEntity {
    public ProductEntity() {

    }
    @Column(length = 30)
    private String name;
    @Column(columnDefinition = "TEXT")
    private String profile;
    @Column(length = 120)
    private String productFirstImgPath;
    @Column(length = 120)
    private String productSecondImgPath;
    private float price;
    @Column(name = "create_user_id")
    private int createUserId;
    @Convert(converter = TypeEnumConverter.class)
    private BoolType analysis;
    @Convert(converter = TypeEnumConverter.class)
    private BoolType generateReport;
    @Convert(converter = TypeEnumConverter.class)
    private ProductStatusType statusType;

    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "pipline_id", referencedColumnName = "id")
    private BioPipLineEntity bioPipLineEntity;

    @OneToMany(cascade = {CascadeType.ALL})
    @JoinColumn(name = "panel_id", referencedColumnName = "id")
    private PanelEntity panelEntity;
}
