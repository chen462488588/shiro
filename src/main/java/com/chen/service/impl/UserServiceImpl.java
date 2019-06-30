package com.chen.service.impl;

import com.chen.dao.UserMapper;
import com.chen.model.User;
import com.chen.model.UserExample;
import com.chen.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserMapper mapper;

    @Override
    public List<User> userList() {
        UserExample example = new UserExample();
        example.createCriteria().andActiveEqualTo(true);
        return mapper.selectByExample(example);
    }
}
