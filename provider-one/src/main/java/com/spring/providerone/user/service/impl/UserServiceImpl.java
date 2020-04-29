package com.spring.providerone.user.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.spring.providerone.user.mapper.UserMapper;
import com.spring.providerone.user.entity.User;
import com.spring.providerone.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void createUser(User user) {
        userMapper.insert(user);
    }

    @Override
    public List findAllUser() {
        return userMapper.selectList(null);
    }

    @Override
    public void delUser(String id) {
      userMapper.deleteById(Integer.parseInt(id));
    }

    @Override
    public void updateUser(User user) {
      userMapper.update(user,null);
    }

    @Override
    public User findUser(User user) {
        QueryWrapper<User> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("name",user.getName());
        queryWrapper.eq("email",user.getEmail());
        User user1 = userMapper.selectOne(queryWrapper);
        return user1;
    }


}
