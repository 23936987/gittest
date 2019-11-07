package com.hj.gittest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {


    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }



    @RequestMapping("/sayHello")
    public String sayHello(String name){
        return "sayHello : " + name;
    }
}
