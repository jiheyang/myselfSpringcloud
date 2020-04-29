package com.spring.providerone.menu.service.impl;

import com.spring.providerone.menu.entity.TUser;
import com.spring.providerone.menu.mapper.TUserMapper;
import com.spring.providerone.menu.service.ITUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author admin
 * @since 2020-01-14
 */
@Service
public class TUserServiceImpl extends ServiceImpl<TUserMapper, TUser> implements ITUserService {

}
