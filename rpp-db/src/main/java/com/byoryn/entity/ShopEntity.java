package com.byoryn.entity;

import com.byoryn.base.BaseEntity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

/**
 * @author panguangze
 * @data 2019/10/31
 * 商店表
 */
public class ShopEntity extends BaseEntity {
    public ShopEntity() {

    }
    @Column(length = 30)
    private String shopName;
    /**
     * 是谁创建的这个商店
     */
    @Column(name = "create_user_id")
    private int createUserId;
    @Column(columnDefinition = "text")
    private String profile;
    @Column(length = 120)
    private String address;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "product_id", referencedColumnName = "id")
    private ProductEntity productEntity;

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public int getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(int createUserId) {
        this.createUserId = createUserId;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
