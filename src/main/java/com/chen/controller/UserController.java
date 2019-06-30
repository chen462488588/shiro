package com.chen.controller;

import com.alibaba.fastjson.JSONObject;
import com.chen.model.User;
import com.chen.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private IUserService userService;

    @GetMapping("/")
    @ResponseBody
    public String sayHello(@RequestParam String name) {
        return "hello\t" + name;
    }

    @RequestMapping("index")
    public String index() {
        return "index";
    }

    @GetMapping("users")
    @ResponseBody
    public String getAllUsers(){
        List<User> userList = userService.userList();
        if (null != userList && !userList.isEmpty()) {
            return JSONObject.toJSONString(userList);
        }
        return "null";

    }
}
