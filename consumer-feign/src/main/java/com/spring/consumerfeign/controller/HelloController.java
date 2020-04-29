package com.spring.consumerfeign.controller;

import com.spring.consumerfeign.entity.Demo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping(value = "/index")
    public String index(Map<String,Object> map){
        Demo demo=new Demo();
        demo.setId(1);
        demo.setName("测试");
        demo.setPhone("121313");
        demo.setTitle("内容");
        map.put("demo",demo);
        return "hello";
    }

}
