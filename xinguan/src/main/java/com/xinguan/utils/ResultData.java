package com.xinguan.utils;

import lombok.Data;

import java.io.Serializable;

/**
 * 控制器返回封装
 *
 * @param <T>
 * @author 
 */
@Data
public class ResultData<T> implements Serializable {

    private int code;
    private String msg;
    private T data;


    private ResultData (CodeMsg codeMsg) {
        if (codeMsg != null) {
            this.code = codeMsg.getCode();
            this.msg = codeMsg.getMsg();
        }
    }

    private ResultData (CodeMsg codeMsg,T data) {
        if (codeMsg != null) {
            this.code = codeMsg.getCode();
            this.msg = codeMsg.getMsg();
            this.data = data;
        }
    }
    private ResultData(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }


    public  static<T> ResultData<T> success(CodeMsg codeMsg ,T data){
        return new ResultData<>(codeMsg,data);
    }

    public  static<T> ResultData<T> success(T data){
        return new ResultData<>(CodeMsg.SUCCESS,data);
    }

    public  static<T> ResultData<T> error(CodeMsg codeMsg){
        return new ResultData<>(codeMsg);
    }


    public static <T> ResultData<T> error( int code , String codeMsg) {
        return new ResultData(code ,codeMsg);
    }



}
