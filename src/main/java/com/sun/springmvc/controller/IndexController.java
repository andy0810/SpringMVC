package com.sun.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class IndexController {

    @RequestMapping("/index")
    public String index(){
        System.out.println("----开始----");
        return "index";
    }
}
