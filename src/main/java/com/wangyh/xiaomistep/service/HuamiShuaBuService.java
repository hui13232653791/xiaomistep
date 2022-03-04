package com.wangyh.xiaomistep.service;

import java.util.concurrent.CompletableFuture;

/**
 * 华米刷步接口
 */
public interface HuamiShuaBuService {
    /**
     * 对正确的账户刷小米运动步数
     *
     * @param user phone of XiaoMi
     * @param pass password of XiaoMi
     * @param step Number of steps
     * @return bool
     */
    CompletableFuture<Boolean> mainHandler(String user, String pass, Integer step);
}
