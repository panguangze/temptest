package com.byoryn.rppdb.entity;

/**
 * @author panguangze
 * @data 2019/10/31
 */
public enum OrderStatusType {
    ORDERED((byte) 0, "已下单"),
    POSTED((byte)1, "已邮寄"),
    SAMPLE__ALL_RECEIVED((byte)2, "完成收样"),
    SEQUENCE_ALL_RECEIVED((byte)3, "已全部添加基因信息"),
    IN_ANALYSIS((byte)4, "分析中"),
    ANALYSIS_COMPLETE((byte)5, "完成分析"),
    REPORT_GENERATED((byte)6, "生成报告");

    private byte typeCode;
    private String typeValue;

    OrderStatusType(byte typeCode, String typeValue) {
        this.typeCode = typeCode;
        this.typeValue = typeValue;
    }


}
