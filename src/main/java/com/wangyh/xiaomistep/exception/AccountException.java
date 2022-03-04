package com.wangyh.xiaomistep.exception;

/**
 * 账户异常类
 */
public class AccountException extends RuntimeException {
    public AccountException() {
        super("用户名或密码错误");
    }
}
