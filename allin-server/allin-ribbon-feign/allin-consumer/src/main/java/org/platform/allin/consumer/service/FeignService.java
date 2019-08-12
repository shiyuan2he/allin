package org.platform.allin.consumer.service;

import org.platform.allin.consumer.dao.AllinProducerDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author heshiyuan
 * @description <p></p>
 * @path allin-server/org.platform.allin.consumer.service
 * @date 2019/8/9 22:46
 */
@Service
public class FeignService {

    @Autowired
    private AllinProducerDao allinProducerDao;

    public String feignInvoke(){
        return allinProducerDao.hello();
    }
}
