package org.springboot.learn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Spring Boot
 *
 * @RestController 提供实现了REST API，可以服务JSON,XML或者其他。这里是以String的形式渲染出结果。
 * @RequestMapping 提供路由信息
 */
@Controller
public class HelloWorldController {
    @RequestMapping("/")
    public String index(ModelMap map) {
        map.addAttribute("host", "http://blog.didispace.com");
        return "index";
    }

}
