package com.example.springbootstudy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


/**
 * @Title:
 * @Description:
 * @author: wangsai
 * @date 2019/8/5 16:27
 */

@Controller
@RequestMapping(value = "/StudentInfoCon")
public class ShowThymeleafController {
    @GetMapping(value = "/login")
//    public ModelAndView login() {
//        ModelAndView login = new ModelAndView();
//        login.setViewName("Login");
//        return login;
//    }
    public String login(){
        return "Login";
    }
}