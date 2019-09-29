package org.platform.allin.producer.controller;

import org.platform.allin.producer.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

/**
 * @date 2019/8/3 10:17
 * @author heshiyuan
 */
@RestController
@RequestMapping("/hello")
public class HelloController {
    @Autowired
    ConsumerService consumerService;
    @GetMapping
    public String hello() {
        return "hello, this is Allin-producer !";
    }

    @GetMapping(value = "/add")
    public Integer add(Integer a, Integer b) {
        return a + b;
    }
   /* @GetMapping(value = "/consumer/info")
    public ResponseEntity<Map> getConsumerInfo(){
        Map<String, String> returnMap = new HashMap<>();
        returnMap.put("data", consumerService.getConsumerInfo());
        return ResponseEntity.ok(returnMap);
    }*/

    @GetMapping(value = "/test", produces="application/json; charset=utf-8")
    public String test(HttpServletRequest request) {
        System.out.println("----------------header----------------");
        Enumeration headerNames = request.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String key = (String) headerNames.nextElement();
            System.out.println(key + ": " + request.getHeader(key));
        }
        System.out.println("----------------header----------------");
        return "hello world";
    }
}