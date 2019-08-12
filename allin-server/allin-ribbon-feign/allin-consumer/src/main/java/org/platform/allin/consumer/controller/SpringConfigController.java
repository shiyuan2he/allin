package org.platform.allin.consumer.controller;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * spring config server读取接口
 */
@RefreshScope
@RestController
@RequestMapping("/config")
class SpringConfigController {
//    @Autowired
//    ConfigConstant configConstant;
//    @RequestMapping("/hello")
//    public String from() {
//        return configConstant.getHello();
//    }
}