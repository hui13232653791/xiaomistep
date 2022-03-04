package com.wangyh.xiaomistep.exception;

/**
 *当前异常类
 */
public class CurrentException extends RuntimeException {
    public CurrentException() {
        super("请不要频繁点击");
    }
}
