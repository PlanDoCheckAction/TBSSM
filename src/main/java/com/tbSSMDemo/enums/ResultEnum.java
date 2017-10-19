package com.tbSSMDemo.enums;

public enum ResultEnum {
    UNKONW_ERROR(-1, "未知错误"),
    SUCCESS(0, "成功"),
    INSERT_ERROR(101,"插入异常"),
    UPDATE_ERROR(102,"更新异常"),
    DELETE_ERROR(103,"删除异常"),
    SELECT_ERROR(104,"查询异常"),
    ;

    private Integer code;

    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

}
