package com.wzx.controller;

import com.netflix.discovery.converters.Auto;
import org.springframework.cloud.client.ServiceInstance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @Description: TODO
 * @author: wengzx
 * @date: 2021年04月07日 17:04
 */
@RestController
@RequestMapping("/client8082")
public class DiscoveryClientController {

    @Autowired
    DiscoveryClient discoveryClient;

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("getHello")
    public String getClient8081Hello(){
        List<ServiceInstance> eurekaClient8081 = discoveryClient.getInstances("eurekaClient8081");
        ServiceInstance serviceInstance = eurekaClient8081.get(0);
        String url = "http://"+serviceInstance.getServiceId()+"/client8081/hello";
        String result = restTemplate.getForObject(url, String.class);
        System.out.println(result);
        return result;
    }
}
