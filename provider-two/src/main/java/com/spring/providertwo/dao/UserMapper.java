package com.spring.providertwo.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.spring.providertwo.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
