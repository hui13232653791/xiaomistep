package com.wangyh.xiaomistep.exception;

/**
 * 密码异常类
 */
public class PasswordException extends RuntimeException {
    public PasswordException() {
        super("密码格式错误");
    }
}
