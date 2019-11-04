package com.byoryn.rppdb.enums;

import com.byoryn.rppdb.base.BaseTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author panguangze
 * @date 2019/10/31
 */
@Getter
@AllArgsConstructor
public enum UserRoleType implements BaseTypeEnum {
    PLATFORM((byte) 0, "平台"),

    BUSINESSES((byte) 1, "商家");

    private byte typeCode;
    private String typeName;

}
