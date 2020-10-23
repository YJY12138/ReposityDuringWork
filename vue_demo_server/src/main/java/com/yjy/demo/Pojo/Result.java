package com.yjy.demo.Pojo;

import com.yjy.demo.enums.ResultCode;

public class Result {
    String code;
    public Result( ResultCode result) {
        this.code = result.getCode();
    }

    public String getCode() {
        return code;
    }

    public void setCode(ResultCode result) {
        this.code = result.getCode();
    }
}
