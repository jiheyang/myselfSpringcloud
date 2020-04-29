package com.spring.consumerfeign.controller;

import com.spring.consumerfeign.entity.Demo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping("/bs")
public class BsOneController {

    @RequestMapping(value = "/index")
    public String index(Map<String,Object> map){
        Demo demo=new Demo();
        demo.setId(1);
        demo.setName("测试");
        demo.setPhone("121313");
        demo.setTitle("内容");
        map.put("demo",demo);
        return "bsOne";
    }

}
