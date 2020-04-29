package com.spring.providerone.user.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("hello")
public class HelloController {

    @RequestMapping(value = "index")
    public String freemarkerindexController(Map<String,Object> result){

        return "hello world!";
    }

}
