package com.spring.providerone.user.service;

import com.spring.providerone.user.entity.User;

import java.util.List;
import java.util.Map;

public interface UserService {
   public void createUser(User user);
   public List findAllUser();
   void delUser(String id);
   void updateUser(User user);
   public  User findUser(User user);

}
