package com.spring.consumerfeign.service.impl;

import com.spring.consumerfeign.entity.User;
import com.spring.consumerfeign.service.UserService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class HystricService implements UserService {
    @Override
    public String sayHiFromClientOne(String name) {
        return "服务器开了小差，请休息一会再试！";
    }

    @Override
    public List getUserList() {
        return null;
    }

    @Override
    public String addUser(User user) {
        return "服务器开了小差，请休息一会再试！";
    }

    @Override
    public String updateUser(User user) {
        return "服务器开了小差，请休息一会再试！";
    }

    @Override
    public String delUser(String id) {
        return "服务器开了小差，请休息一会再试！";
    }

    @Override
    public User findUser(User user) {
        return user;
    }
}
