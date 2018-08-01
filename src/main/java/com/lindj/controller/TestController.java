package com.lindj.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: lindj
 * @date: 2018/8/1
 * @description: //TODO
 **/
@RestController
@RequestMapping("/user")
public class TestController {

    @GetMapping(value = "/get")
    public Object getUser(){
        return "hello";
    }
}
