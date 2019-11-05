package com.byoryn.rppdb.entity;

import com.byoryn.rppdb.base.BaseEntity;
import com.byoryn.rppdb.enums.OrderStatusType;
import com.byoryn.rppdb.utils.CodeValueConverter;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;

/**
 * @author panguangze
 * @date 2019/10/31
 */
@Setter
@Getter
@ToString
@Entity
public class OrderStatusProcessEntity extends BaseEntity {
    private byte orderStatusType;
}
