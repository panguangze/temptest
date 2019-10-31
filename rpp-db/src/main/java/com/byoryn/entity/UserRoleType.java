package com.byoryn.entity;

/**
 * @author panguangze
 * @data 2019/10/31
 */
public enum UserRoleType  {
    PLATFORM(0, "平台"),

    BUSINESSES(1, "商家");

    private int typeNum;
    private String typeName;

    UserRoleType(int typeNum, String typeName) {
        this.typeNum = typeNum;
        this.typeName = typeName;
    }

    public int getTypeNum() {
        return typeNum;
    }

    public String getTypeName() {
        return typeName;
    }
}
