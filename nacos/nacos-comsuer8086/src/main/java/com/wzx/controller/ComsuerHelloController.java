package com.wzx.controller;

import com.wzx.feign.ProducerHelloFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Description: TODO
 * @author: wengzx
 * @date: 2021年04月12日 15:24
 */
@RestController
@RequestMapping("/nacos")
public class ComsuerHelloController {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    ProducerHelloFeign producerHelloFeign;

    @GetMapping("/comsuer")
    public String comsuerHello(@RequestParam("user") String user){

        String url="http://producer-8085/nacos/producer?user="+user;
        return restTemplate.getForObject(url,String.class);
    }

    @GetMapping("/comsuerFeign")
    public String comsuerFeign(@RequestParam("user") String user){

        return producerHelloFeign.nacosProducerHello(user);
    }
}
