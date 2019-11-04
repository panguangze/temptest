package com.byoryn.rppdb.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author panguangze
 * @data 2019/10/31
 */
@Getter
@AllArgsConstructor
public enum ProductStatusType {
    ONLINE((byte) 0, "已上线"),
    OFFLINE((byte) 1, "已下线"),
    DELETED((byte) 2, "已删除");

    private byte typeCode;
    private String typeValue;
}
