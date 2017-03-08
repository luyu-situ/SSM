package com.situdata.controller;

import com.situdata.service.IUserTService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017/3/8.
 */
@Controller
public class HelloWorldController {
    @Resource
    private IUserTService iUserTService;

    @RequestMapping("/hello")
    public String hello(Model model) {

        model.addAttribute("greeting", "Hello "+iUserTService.getUserById(1).getUserName());

        return "helloworld";

    }
}
