package com.pdtdang.demospringboot.ultis;

import com.pdtdang.demospringboot.entity.Customer;

import java.lang.reflect.Array;
import java.util.List;

public class ResponseBean {
    private int code;
    private String message;
    private List<Customer> data;

    public ResponseBean() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<Customer> getData() {
        return data;
    }



    public void setData(List<Customer> data) {

        this.data = data;
    }
    public void success(List<Customer> data) {
        this.code = 200;
        this.message = "Success";
        this.data = data;
    }

    @Override
    public String toString() {
        return "{" +
                "\"code\":" + code +
                ", \"message\":\"" + message + '\"' +
                ", \"data\":" + data +
                '}';
    }


}
