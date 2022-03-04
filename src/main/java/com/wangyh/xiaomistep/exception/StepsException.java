package com.wangyh.xiaomistep.exception;

/**
 * 步数异常类
 */
public class StepsException extends RuntimeException {
    public StepsException() {
        super("步数输入异常");
    }
}
