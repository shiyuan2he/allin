package org.platform.allin.consumer.dao;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

/**
 * @author heshiyuan
 * @description <p>
 *     feignClient熔断器
 * </p>
 * @path allin-server/org.platform.allin.consumer.dao
 * @date 2019/8/9 23:29
 */
@Slf4j
@Repository
public class AllinProducerDaoHystrix implements AllinProducerDao{
    @Override
    public String hello() {
        log.warn("这里是AllinProducerDao熔断器");
        return "this is AllinProducerDaoHystrix";
    }
}
