package com.aaa.controller;

import com.aaa.service.UserService;
import com.sun.deploy.util.IcoEncoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * fileName:UserController
 * description:
 * author:zz
 * createTime:2019-03-02 16:44
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
       private UserService userService;
    @RequestMapping("/getUser")
    public @ResponseBody List<Map<String,Object>> getUser(){

        List<Map> list = new ArrayList<>();
        Map map=new HashMap();
        System.out.println("测试分支");
        map.put("ip","192.168.226.30");
        list.add(map);
        return userService.getUser();
    }
}
