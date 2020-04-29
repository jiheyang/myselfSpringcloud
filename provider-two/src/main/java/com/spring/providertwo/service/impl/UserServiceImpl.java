package com.spring.providertwo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.spring.providertwo.dao.UserMapper;
import com.spring.providertwo.entity.User;
import com.spring.providertwo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

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
