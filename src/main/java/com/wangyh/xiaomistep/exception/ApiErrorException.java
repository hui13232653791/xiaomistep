package com.wangyh.xiaomistep.exception;

/**
 * Api调用异常类
 */
public class ApiErrorException extends RuntimeException{
    public ApiErrorException() {
        super("Api调用异常，请稍后尝试");
    }
}
