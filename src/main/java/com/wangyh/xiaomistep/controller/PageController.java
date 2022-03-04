package com.wangyh.xiaomistep.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Page控制层
 */
@Controller
@CrossOrigin
public class PageController {

    @RequestMapping("/")
    public String see() {
        return "step";
    }

}
