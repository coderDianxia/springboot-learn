package com.wzx.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: TODO
 * @author: wengzx
 * @date: 2021年04月07日 16:30
 */
@RestController
@RequestMapping("/client8081")
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "hello world";
    }


}
