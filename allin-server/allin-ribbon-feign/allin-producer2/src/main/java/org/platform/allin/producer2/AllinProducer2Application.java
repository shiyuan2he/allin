package org.platform.allin.producer2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @date 2019/8/3 10:17
 * @author heshiyuan
 */
//@EnableHystrix
@EnableDiscoveryClient
@SpringBootApplication
public class AllinProducer2Application {

	public static void main(String[] args) {
		SpringApplication.run(AllinProducer2Application.class, args);
	}
}