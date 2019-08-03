package org.platform.allin.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author heshiyuan
 * @description <p></p>
 * @path allin/org.platform.allin.eureka
 * @date 2019/8/3 10:41
 */
@SpringBootApplication
@EnableEurekaServer
public class AllinEurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(AllinEurekaApplication.class, args);
    }
}
