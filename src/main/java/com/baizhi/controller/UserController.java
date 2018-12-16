package com.baizhi.controller;

import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("u")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("ua")
    public List<User> queryAll(){
    return userService.queryALl();

    }

}
