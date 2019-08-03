package org.platform.allin.consumer.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author heshiyuan
 */
@Slf4j
@RestController
public class RibbonHelloController {

    @Autowired
    private RestTemplate restTemplate;
    
    @RequestMapping("/ribbon/call")
    public String call() {
        log.info("正在调用http://allin-producer2/hello 。。。");
        return restTemplate.getForObject("http://allin-producer2/hello", String.class);
    }
}