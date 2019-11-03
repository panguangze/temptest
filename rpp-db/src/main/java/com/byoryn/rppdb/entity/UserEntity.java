package com.byoryn.rppdb.entity;


import com.byoryn.rppdb.base.BaseEntity;
import com.byoryn.rppdb.enums.BoolType;
import com.byoryn.rppdb.enums.UserRoleType;
import com.byoryn.rppdb.utils.CodeValueConverter;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

/**
 * @author panguangze
 * @data 2019/10/31
 * 用户表
 */
@Setter
@Getter
@ToString
@Entity
public class UserEntity extends BaseEntity {
    @Column(length = 30)
    private String username;
    private String password;
    @Column(length = 30)
    private String firstName;
    @Column(length = 30)
    private String LastName;
    /**
     * 存储头像的位置
     */
    @Column(length = 120)
    private String avatarPath;
    @Column(length = 120)
    private String email;
    @Column(length = 30)
    private String phoneNum;
    @Column(length = 120)
    private String city;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "shop_id", referencedColumnName = "id")
    private ShopEntity shopEntity;
    /**
     * 该用户是否可用，默认可用
     */
    @Column(columnDefinition = "tinyint")
    @Convert(converter = CodeValueConverter.class)
    private BoolType active;
    private int createUserId;
    /**
     * 角色，目前设计0：平台管理员，1：商家，后期可能会有扩展
     */
    @Column(columnDefinition = "tinyint")
    @Convert(converter = CodeValueConverter.class)
    private UserRoleType userRoleType;

}
