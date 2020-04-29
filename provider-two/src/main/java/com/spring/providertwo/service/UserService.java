package com.spring.providertwo.service;

import com.spring.providertwo.entity.User;

import java.util.List;

public interface UserService {
   public void createUser(User user);
   public List findAllUser();
   void delUser(String id);
   void updateUser(User user);
   User findUser(User user);

}
