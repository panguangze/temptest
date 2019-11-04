package com.byoryn.rppcommom.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * 通用返回对象
 * Created by macro on 2019/4/19.
 */
@Setter
@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseResult implements Serializable {
    private final static String SUCCESS = "success";
    //错误码
    private String errorCode;
    //错误信息
    private String errorMessage;
    //响应实体内容
    private Object data;

    private ResponseResult(Object data) {
        this.data = data;
    }

    private ResponseResult(String errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorCode = errorMessage;
    }

    /**
     * 成功响应，并且返回结果
     *
     * @param data 获取的数据
     */
    public static   ResponseResult ok(Object data) {
        return new ResponseResult(data);
    }

    /**
     * 成功响应，但是不关注结果
     */
    public static ResponseResult success() {
        return ResponseResult.ok(SUCCESS);
    }

    /**
     * 失败响应，返回错误信息
     * @param errorCode 错误码
     */
    public static ResponseResult error(String errorCode, String errorMessage) {
        return new ResponseResult(errorCode, errorMessage);
    }
}
