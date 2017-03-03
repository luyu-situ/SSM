package com.situdata.service.impl;

/**
 * Created by Administrator on 2017/3/3.
 */
import javax.annotation.Resource;

import com.situdata.dao.UserTMapper;
import com.situdata.pojo.UserT;
import com.situdata.service.IUserTService;
import org.springframework.stereotype.Service;


@Service("userService")
public class UserTServiceImpl implements IUserTService {
    @Resource
    private UserTMapper userTMapper;

    @Override
    public UserT getUserById(int userId) {
        return this.userTMapper.selectByPrimaryKey(userId);
    }



}