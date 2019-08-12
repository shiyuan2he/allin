package org.platform.allin.producer.controller;

import org.platform.allin.producer.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @date 2019/8/3 10:17
 * @author heshiyuan
 */
@RestController
@RequestMapping("/producer")
public class HelloController {
    @Autowired
    ConsumerService consumerService;
    @RequestMapping("/hello")
    public String hello() {
        return "hello, this is Allin-producer !";
    }

    @GetMapping(value = "/consumer/info")
    public ResponseEntity<Map> getConsumerInfo(){
        Map<String, String> returnMap = new HashMap<>();
        returnMap.put("data", consumerService.getConsumerInfo());
        return ResponseEntity.ok(returnMap);
    }
}