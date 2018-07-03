package org.springboot.learn.controller;

import org.springboot.learn.config.BlogProperties;
import org.springboot.learn.config.HomeProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloHomeController {
    @Autowired
    HomeProperties homeProperties;

    @RequestMapping("/hello/home")
    public String SayHelloHome() {
        return homeProperties.toString();
    }
}
