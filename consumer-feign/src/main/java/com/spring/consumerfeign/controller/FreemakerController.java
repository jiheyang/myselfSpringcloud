package com.spring.consumerfeign.controller;

import com.spring.consumerfeign.entity.Demo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/freemaker")
public class FreemakerController {

    @RequestMapping(value = "/demoList")
    public String index(Map<String,Object> map){
        List<Demo> list=new ArrayList<>();
        for (int i=1;i<=4;i++){
            Demo demo=new Demo();
            demo.setId(1);
            demo.setName("标题"+i);
            demo.setPhone("121313"+i);
            demo.setTitle("内容"+i);
            list.add(demo);
        }
        map.put("demoList",list);
        return "list";
    }

}
