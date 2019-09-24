package org.platform.allin.oauth2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author heshiyuan
 * @description <p></p>
 * @path allin-server/org.platform.allin.oauth2
 * @date 2019/9/19 22:10
 */
@SpringBootApplication
@EnableDiscoveryClient
public class AllinOauth2Application {

    public static void main(String[] args) {
        SpringApplication.run(AllinOauth2Application.class, args);
    }

}
