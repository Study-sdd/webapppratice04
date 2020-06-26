package com.example.webapppratice04.controller;

import com.example.webapppratice04.mapper.UserMapper;
import com.example.webapppratice04.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class hiController {
    @Autowired     //借助Autowired 导入数据
    private UserMapper userMapper;   //导入的数据
    @GetMapping("/register")

    @RequestMapping("/register")
    public String register(HttpServletRequest request)
    {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        System.out.println(username);
        System.out.println(password);

        //初始化
        User user=new User();
        user.setUsername(username);
        user.setPassword(password);

        //将获得的数据写入到数据库中
        userMapper.adduser(user);

        return "register";
    }
}
