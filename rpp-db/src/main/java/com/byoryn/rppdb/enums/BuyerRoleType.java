package com.byoryn.rppdb.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author panguangze
 * @data 2019/10/31
 */
@Getter
@AllArgsConstructor
public enum BuyerRoleType {
    NORMAL((byte) 0, "个人买家");

    private byte typeCode;
    private String typeValue;
}
