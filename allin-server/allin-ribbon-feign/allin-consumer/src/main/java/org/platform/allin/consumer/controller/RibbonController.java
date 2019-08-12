package org.platform.allin.consumer.controller;

import lombok.extern.slf4j.Slf4j;
import org.platform.allin.consumer.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * ribbon 模拟测试
 * @author heshiyuan
 */
@Slf4j
@RestController
@RequestMapping("/ribbon")
public class RibbonController {

    @Autowired
    RibbonService ribbonService;
    
    @RequestMapping("/call")
    public String call() {
        return ribbonService.ribbonInvoke();
    }

    @RequestMapping("/{username}")
    public ResponseEntity<Boolean> testHystrix(@PathVariable("username") String username) throws Exception {
        return ResponseEntity.ok(ribbonService.judgeIsMyName(username));
    }
}