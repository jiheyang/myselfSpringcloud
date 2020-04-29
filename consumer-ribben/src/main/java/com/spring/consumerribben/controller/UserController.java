package com.spring.consumerribben.controller;

import com.spring.consumerribben.entity.User;
import com.spring.consumerribben.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value ="/hi")

    public String hi(@RequestParam String name){

        return userService.hiService(name);

    }

    @RequestMapping(value ="/userList")

    public List userList(){

        return userService.userList();

    }

    @RequestMapping(value ="/addUser")

    public String addUser(@RequestParam String id,String username){

        User user =new User();

        user.setId(Integer.parseInt(id));

        user.setName(username);

        user.setAge(18);

        user.setEmail(username+"@163.com");
        return userService.addUser(user);

    }

    @GetMapping(value ="/updateUser")

    public String updateUser(@RequestParam String id,String username){

        User user =new User();

        user.setId(Integer.parseInt(id));

        user.setName(username);

        user.setAge(18);

        user.setEmail(username+"@163.com");

        return userService.updateUser(user);

    }

    @GetMapping(value ="/delUser")

    public String delUser(@RequestParam String id){return userService.delUser(id);}


}
