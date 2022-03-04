package com.wangyh.xiaomistep.exception;

/**
 * 号码异常类
 */
public class PhoneException extends RuntimeException {
    public PhoneException() {
        super("手机号格式错误");
    }
}
