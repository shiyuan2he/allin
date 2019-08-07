package org.platform.allin.consumer.service;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * 熔断器测试
 * @author heshiyuan
 */
@Component
public class AllinProducerHystrix implements AllinProducerService {

    @Override
    @RequestMapping("/hello")
    public String hello() {
    	return "sorry, hello service call failed.";
    }
}
