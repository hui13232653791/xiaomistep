package com.wangyh.xiaomistep.service;

import java.util.concurrent.CompletableFuture;

/**
 * 步数检查接口
 */
public interface StepsCheckService {

    /**
     * 检查步数合法性
     *
     * @param step
     * @return
     */
    CompletableFuture<Boolean> stepsCheck(Integer step);
}
