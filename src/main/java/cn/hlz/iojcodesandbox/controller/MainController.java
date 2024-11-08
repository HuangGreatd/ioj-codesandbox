package cn.hlz.iojcodesandbox.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: MainController
 * @Description: Ceshi
 * @Author: 橘子皮
 * @Date: 2024-11-05 08:13
 * @Version: 1.0
 **/
@RestController("/")
public class MainController {
    @GetMapping("/ok")
    public String mainHello() {
        return "ok";
    }
}
