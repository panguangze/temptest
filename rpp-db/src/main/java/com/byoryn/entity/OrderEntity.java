package com.byoryn.entity;

import com.byoryn.base.BaseEntity;
import com.byoryn.utils.TypeEnumConverter;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 * @author panguangze
 * @data 2019/10/31
 */
public class OrderEntity extends BaseEntity {
    public OrderEntity() {

    }

    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "buyer_id", referencedColumnName = "id")
    private BuyerEntity buyerEntity;
    @Column(name = "create_user_id")
    private int CreateUserId;
    @Convert(converter = TypeEnumConverter.class)
    private BoolType sequence;
    @Convert(converter = TypeEnumConverter.class)
    private BoolType post;
    @Column(name = "real_price")
    private float realPrice;
    @Convert(converter = TypeEnumConverter.class)
    private OrderStatusType orderStatusType;
    @Convert(converter = TypeEnumConverter.class)
    private BoolType active;

    @OneToMany(cascade = {CascadeType.ALL})
    @JoinColumn(name = "order_status_id", referencedColumnName = "id")
    private OrderStatusProcess statusProcess;

}
