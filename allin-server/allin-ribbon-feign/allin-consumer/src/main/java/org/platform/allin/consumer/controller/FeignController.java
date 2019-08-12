package org.platform.allin.consumer.controller;

import org.platform.allin.consumer.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author heshiyuan
 */
@RestController
@RequestMapping("/feign")
public class FeignController {

    @Autowired
    FeignService feignService;
    
    @RequestMapping("/call")
    public String call() {
        return feignService.feignInvoke();
    }
}