package com.byoryn.entity;

import java.util.Arrays;

/**
 * @author panguangze
 * @data 2019/10/31
 */
public enum OrderStatusType {
    ORDERED(0, "已下单"),
    POSTED(1, "已邮寄"),
    SAMPLE__ALL_RECEIVED(2, "完成收样"),
    SEQUENCE_ALL_RECEIVED(3, "已全部添加基因信息"),
    IN_ANALYSIS(4, "分析中"),
    ANALYSIS_COMPLETE(5, "完成分析"),
    REPORT_GENERATED(6, "生成报告");

    private int typeNum;
    private String typeValue;

    OrderStatusType(int typeNum, String typeValue) {
        this.typeNum = typeNum;
        this.typeValue = typeValue;
    }


}
