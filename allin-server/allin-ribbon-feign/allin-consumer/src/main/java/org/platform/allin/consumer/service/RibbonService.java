package org.platform.allin.consumer.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.client.RestTemplate;

/**
 * @author heshiyuan
 * @description <p></p>
 * @path allin-server/org.platform.allin.consumer.service
 * @date 2019/8/9 22:44
 */
@Slf4j
@Service
public class RibbonService {
    @Autowired
    RestTemplate restTemplate;

    public String ribbonInvoke(){
        log.info("正在调用http://allin-producer2/hello 。。。");
        return restTemplate.getForObject("http://allin-producer2/hello", String.class);
    }
    String myName = "hystrix";
    @HystrixCommand(fallbackMethod = "judgeIsMyNameHystrix")
    public Boolean judgeIsMyName(String username) throws Exception {
        if(myName.equals(username)){
            return true;
        }else{
            throw new Exception("this is not my name");
        }
    }

    /**
     * judgeIsMyName 熔断器
     * @param username
     * @return
     */
    @SuppressWarnings("unused")
    public Boolean judgeIsMyNameHystrix(String username){
        log.warn("这里是judgeIsMyName熔断器");
        return false;
    }
}
