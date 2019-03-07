package com.aaa.service.impl;

import com.aaa.dao.UserDao;
import com.aaa.service.UserService;
import com.aaa.util.JedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * fileName:UserServiceImpl
 * description:
 * author:zz
 * createTime:2019-03-02 16:39
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao dao;
    @Override
    public List<Map<String, Object>> getUser() {

            List<Map<String,Object>> list = dao.getUser();
            return  list;


    }
}
