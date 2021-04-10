package com.cyanfox.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @ClassName Hellocontroller
 * @Description TODO
 * @Author bunny
 * @Date 2021/4/10 21:04
 * @Version 1.0
 **/

@Controller
@RequestMapping(path="/user")
public class Hellocontroller {

    @RequestMapping(path="/hello")
    public String sayhello(){
        System.out.println("hello springmvc");
        return "success";
    }

    @RequestMapping(path="/testRequestMapping",params = {"username"})
    public String testRequestMapping(){
        System.out.println("测试RequestMapping注解");
        return "success";
    }
}
