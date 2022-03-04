package com.wangyh.xiaomistep.service;

import java.util.concurrent.CompletableFuture;

/**
 * 号码检查接口
 */
public interface PhoneCheckService {
    /**
     * 检查手机号合法性
     *
     * @param phone
     * @return
     */
    CompletableFuture<Boolean> phoneCheck(String phone) ;
}
