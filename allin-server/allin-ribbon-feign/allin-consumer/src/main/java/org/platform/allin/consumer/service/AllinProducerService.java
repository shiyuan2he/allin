package org.platform.allin.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * fallback = AllinProducerHystrix.class
 * @author heshiyuan
 */
@FeignClient(name = "allin-producer")
public interface AllinProducerService {

    @RequestMapping("/hello")
    String hello();
}
