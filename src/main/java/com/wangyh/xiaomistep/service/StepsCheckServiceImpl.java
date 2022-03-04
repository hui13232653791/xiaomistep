package com.wangyh.xiaomistep.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

/**
 * 步数检查接口实现类
 */
@Slf4j
@Service
public class StepsCheckServiceImpl implements StepsCheckService{
    @Override
    @Async
    public CompletableFuture<Boolean> stepsCheck(Integer step) {
        if (step==null){
            log.info("StepCheck-error: null ");
            return CompletableFuture.completedFuture(false);
        }
        if (step<=1||step>=90000) {
            log.info("StepCheck-error: "+step);
            return CompletableFuture.completedFuture(false);
        }
        log.info("StepCheck-success: "+step);
        return CompletableFuture.completedFuture(true);
    }
}
