package org.platform.allin.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @date 2019/8/3 10:17
 * @author heshiyuan
 */
@EnableDiscoveryClient
@SpringBootApplication
public class AllinProducer2Application {

	public static void main(String[] args) {
		SpringApplication.run(AllinProducer2Application.class, args);
	}
}