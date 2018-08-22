package com.douyu.aoligouzi.controller;

import com.douyu.aoligouzi.model.User;
import com.douyu.aoligouzi.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by wangcong2 on 2018/8/9
 */
@RestController
@EnableAutoConfiguration
@RequestMapping("/user")
public class TestBootController {
    @Resource
    private UserService userService;

    private static Logger logger = LoggerFactory.getLogger(TestBootController.class);

    @RequestMapping("/")
    @ResponseBody
    public String index() {
        logger.info("进入index方法");
        return "Hello Spring Boot !";
    }

    @RequestMapping("/showUser")
    @ResponseBody
    public User toIndex(HttpServletRequest request, Model model){
        int userId = Integer.parseInt(request.getParameter("id"));
        User user = this.userService.getUserById(userId);
        return user;
    }

    @RequestMapping("/insertUser")
    public boolean insertUser(@RequestParam("id") int id,@RequestParam("userName") String userName,
                           @RequestParam("password") String password,@RequestParam("age") int age){
        User user =new User(id,userName,password,age);
        return userService.addUser(user);
    }



}
