package org.platform.allin.producer.service;

import org.platform.allin.producer.dao.ConsumerDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author heshiyuan
 * @description <p></p>
 * @path allin-server/org.platform.allin.producer.service
 * @date 2019/8/11 10:21
 */
@Service
public class ConsumerService {
    @Autowired
    ConsumerDao consumerDao;
    public String getConsumerInfo(){
        return consumerDao.consumerInfo();
    }
}
