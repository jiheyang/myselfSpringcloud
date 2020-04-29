package com.spring.consumerfeign.controller;

import com.spring.consumerfeign.entity.User;
import com.spring.consumerfeign.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value ="/hi")
    public String sayHi(@RequestParam String name) {

        return userService.sayHiFromClientOne( name );

    }

    @GetMapping(value ="/userList")
    public List userList() {

        return userService.getUserList();

    }

    @GetMapping(value ="/queryUser")
    public User queryUser(@RequestParam String username,String email) {
        User user =new User();
        user.setName(username);
        user.setEmail(email);
        return userService.findUser(user);

    }

    @GetMapping(value ="/addUser")
    public String addUser(@RequestParam String id,String username){

        User user =new User();

        user.setId(Integer.parseInt(id));

        user.setName(username);

        user.setAge(18);

        user.setEmail(id+username+"@163.com");
        return userService.addUser(user);

    }

    @GetMapping(value ="/updateUser")
    public String updateUser(@RequestParam String id,String username){

        User user =new User();

        user.setId(Integer.parseInt(id));

        user.setName(username);

        user.setAge(18);

        user.setEmail(id+username+"update"+"@163.com");

        return userService.updateUser(user);

    }

    @GetMapping(value ="/delUser")
    public String delUser(@RequestParam String id){return userService.delUser(id);}




}
