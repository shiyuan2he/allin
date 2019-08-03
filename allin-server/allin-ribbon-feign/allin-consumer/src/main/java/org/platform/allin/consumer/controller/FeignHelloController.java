package org.platform.allin.consumer.controller;

import org.platform.allin.consumer.service.AllinProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author heshiyuan
 */
@RestController
public class FeignHelloController {

    @Autowired
    private AllinProducerService allinProducerService;
    
    @RequestMapping("/feign/call")
    public String call() {
        // 像调用本地服务一样
        return allinProducerService.hello();
    }
    
}