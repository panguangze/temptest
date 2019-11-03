package com.byoryn.rppdb.enums;

/**
 * @author panguangze
 * @data 2019/10/31
 */
public enum ProductStatusType {
    ONLINE((byte) 0, "已上线"),
    OFFLINE((byte) 1, "已下线"),
    DELETED((byte) 2, "已删除");

    private byte typeCode;
    private String typeValue;

    ProductStatusType(byte typeCode, String typeValue) {
        this.typeCode = typeCode;
        this.typeValue = typeValue;
    }

    public int getTypeCode() {
        return typeCode;
    }
}
