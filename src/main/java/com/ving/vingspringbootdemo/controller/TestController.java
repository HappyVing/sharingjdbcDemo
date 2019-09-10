package com.ving.vingspringbootdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @date 2019/9/9
 */
@RestController
public class TestController {

    @RequestMapping("/test")
    public String test(){
        return "ok";
    }
}
