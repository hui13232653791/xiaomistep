package com.wangyh.xiaomistep.controller;


import com.wangyh.xiaomistep.exception.PasswordException;
import com.wangyh.xiaomistep.exception.PhoneException;
import com.wangyh.xiaomistep.exception.StepsException;
import com.wangyh.xiaomistep.service.HuamiShuaBuService;
import com.wangyh.xiaomistep.service.PasswordCheckService;
import com.wangyh.xiaomistep.service.PhoneCheckService;
import com.wangyh.xiaomistep.service.StepsCheckService;

import com.wangyh.xiaomistep.step.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.CompletableFuture;

/**
 * Step控制层
 */
@Slf4j
@RestController
@CrossOrigin
public class StepController {

    @Autowired
    HuamiShuaBuService huamiShuaBuService;

    @Autowired
    PhoneCheckService phoneCheckService;

    @Autowired
    PasswordCheckService passwordCheckService;

    @Autowired
    StepsCheckService stepsCheckService;

    @GetMapping("/mi")
    public Result start(String u, String p, Integer s) throws Exception {

        CompletableFuture<Boolean> user = phoneCheckService.phoneCheck(u);
        CompletableFuture<Boolean> pwd = passwordCheckService.passCheck(p);
        CompletableFuture<Boolean> step = stepsCheckService.stepsCheck(s);

        if (!user.get()) {
            throw new PhoneException();
        } else if(!pwd.get()) {
            throw new PasswordException();
        } else if(!step.get()) {
            throw new StepsException();
        } else {
            Object o = huamiShuaBuService.mainHandler(u, p, s).join();
        }
        return Result.success(s+"步");

    }
}