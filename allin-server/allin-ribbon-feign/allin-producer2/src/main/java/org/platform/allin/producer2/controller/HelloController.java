package org.platform.allin.producer2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @date 2019/8/3 10:17
 * @author heshiyuan
 */
@RestController
@RequestMapping(value = "/hello")
public class HelloController {

    @GetMapping
    public String hello() {
        return "hello Allin-producer2 !";
    }
}