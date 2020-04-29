package com.spring.providerone.user.controller;

import com.spring.providerone.user.entity.User;
import com.spring.providerone.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/userList")
    public List<User> getUserList(){

        return userService.findAllUser();
    }

    @RequestMapping("/findUser")
    public User getUser(@RequestBody User user){

        return userService.findUser(user);
    }


    @RequestMapping("/add")
    public String addUser(@RequestBody User user){
        if(user!=null){
            userService.createUser(user);
            return "success";
        }else{
            return "error";
        }
    }

    @RequestMapping("/delUser")
    public String delUser(@RequestParam String id) {

        try {
            userService.delUser(id);
            return "del success";
        } catch (Exception e) {
            e.printStackTrace();
            return "del false";
        }
    }

    @RequestMapping("/updateUser")
    public String updateUser(@RequestBody User user){
        try{
            userService.updateUser(user);
            return "update success";
        }catch (Exception e){
            e.printStackTrace();
            return "update false";
        }
    }

    //测试方法，返回服务器端口，以判断是访问哪个服务

    @Value("${server.port}")
    String port;
    @RequestMapping("/hi")
    public String home(@RequestParam(value ="name", defaultValue ="zhangsan") String name) {

        return "hi " + name +" ,i am from port:" +port;

    }



}
