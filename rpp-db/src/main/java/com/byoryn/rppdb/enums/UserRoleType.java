package com.byoryn.rppdb.enums;

import com.byoryn.rppdb.base.BaseTypeEnum;

/**
 * @author panguangze
 * @data 2019/10/31
 */
public enum UserRoleType implements BaseTypeEnum {
    PLATFORM((byte) 0, "平台"),

    BUSINESSES((byte) 1, "商家");

    private byte typeCode;
    private String typeName;

    UserRoleType(byte typeCode, String typeName) {
        this.typeCode = typeCode;
        this.typeName = typeName;
    }

    public byte getTypeCode() {
        return typeCode;
    }

    public String getTypeName() {
        return typeName;
    }
}
