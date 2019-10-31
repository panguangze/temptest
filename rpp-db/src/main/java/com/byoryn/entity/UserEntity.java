package com.byoryn.entity;


import com.byoryn.base.BaseEntity;
import com.byoryn.utils.TypeEnumConverter;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author panguangze
 * @data 2019/10/31
 * 用户表
 */
@Entity
@Table(name = "byoryn_user")
public class UserEntity extends BaseEntity {
    public UserEntity() {

    }
    @Column(length = 30)
    private String username;

    /**
     * 该字段为加密后字段，会在创建时使用spring security配置的加密方式进行加密
     */
    private String password;
    @Column(name = "first_name", length = 30)
    private String firstName;
    @Column(name = "last_name", length = 30)
    private String LastName;

    /**
     * 存储头像的位置
     */
    @Column(name = "avatar_path", length = 120)
    private String avatarPath;
    @Column(length = 120)
    private String email;
    @Column(name = "phone_num", length = 30)
    private String phoneNum;
    @Column(length = 120)
    private String city;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "shop_id", referencedColumnName = "id")
    private ShopEntity shopEntity;

    /**
     * 该用户是否可用，默认可用
     */
    @Convert(converter = TypeEnumConverter.class)
    private BoolType active;
    private int createUserId;

    /**
     * 角色，目前设计0：平台管理员，1：商家，后期可能会有扩展
     */
    @Convert(converter = TypeEnumConverter.class)
    private UserRoleType userRoleType;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getAvatarPath() {
        return avatarPath;
    }

    public void setAvatarPath(String avatarPath) {
        this.avatarPath = avatarPath;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public BoolType getActive() {
        return active;
    }

    public void setActive(BoolType active) {
        this.active = active;
    }

    public int getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(int createUserId) {
        this.createUserId = createUserId;
    }

    public ShopEntity getShopEntity() {
        return shopEntity;
    }

    public void setShopEntity(ShopEntity shopEntity) {
        this.shopEntity = shopEntity;
    }

    public UserRoleType getUserRoleType() {
        return userRoleType;
    }

    public void setUserRoleType(UserRoleType userRoleType) {
        this.userRoleType = userRoleType;
    }
}
