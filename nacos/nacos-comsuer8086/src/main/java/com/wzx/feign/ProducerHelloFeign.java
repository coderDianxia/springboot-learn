package com.wzx.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Description: TODO
 * @author: wengzx
 * @date: 2021年04月12日 16:00
 */
@FeignClient(value = "producer-8085",contextId="producerHelloFeign",path = "/nacos")
public interface ProducerHelloFeign {

    @GetMapping("/producer")
    public String nacosProducerHello(@RequestParam("user") String user);
}
