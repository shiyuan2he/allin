package org.platform.allin.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author heshiyuan
 */
@FeignClient(name = "allin-producer", fallback = AllinProducerHystrix.class)
public interface AllinProducerService {

    @RequestMapping("/hello")
    String hello();
}
