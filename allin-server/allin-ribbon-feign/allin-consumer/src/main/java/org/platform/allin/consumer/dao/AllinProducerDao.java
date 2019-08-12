package org.platform.allin.consumer.dao;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * allin-producer服务调用者
 * @author heshiyuan
 */
@FeignClient(name = "allin-producer", fallback = AllinProducerDaoHystrix.class)
public interface AllinProducerDao {
    /**
     * 模拟allin-producer hello接口
     * @return
     */
    @RequestMapping("/hello")
    String hello();
}
