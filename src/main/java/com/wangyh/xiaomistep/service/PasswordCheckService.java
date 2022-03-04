package com.wangyh.xiaomistep.service;

import java.util.concurrent.CompletableFuture;

/**
 * 密码检查接口
 */
public interface PasswordCheckService {

    /**
     * 检查密码格式合法性
     *
     * @param password
     * @return
     */
    CompletableFuture<Boolean> passCheck(String password);

}
