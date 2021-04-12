package com.wzx.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: TODO
 * @author: wengzx
 * @date: 2021年04月12日 14:54
 */
@RestController
@RequestMapping("/nacos")
public class NacosProducerController {

    @GetMapping("/producer")
    public String nacosProducerHello(@RequestParam("user") String user){
        return "Hello:"+user;
    }
}
