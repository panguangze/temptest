package com.byoryn.rppdb.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum SampleType {
    BLOOD((byte) 0, "血液", "毫升");

    private byte typeCode;
    private String typeValue;
    private String unit;

}
