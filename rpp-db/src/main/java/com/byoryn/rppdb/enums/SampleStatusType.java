package com.byoryn.rppdb.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum SampleStatusType {
    POSTED((byte) 0, "已邮寄");

    private byte typeCode;
    private String typeValue;
}
