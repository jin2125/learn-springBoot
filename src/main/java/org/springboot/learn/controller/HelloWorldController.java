package org.springboot.learn.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Spring Boot
 *
 * @RestController 提供实现了REST API，可以服务JSON,XML或者其他。这里是以String的形式渲染出结果。
 * @RequestMapping 提供路由信息
 */
@RestController
public class HelloWorldController {
    @RequestMapping("/")
    public String sayHello() {
        return "Hello, World!";
    }
}
