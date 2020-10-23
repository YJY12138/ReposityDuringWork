package com.yjy.demo.enums;

public enum ResultCode {

    SUCCESS("00","成功"),
    Failed("99","失败");

    private String code;
    private String message;


    ResultCode(String code,String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

}
