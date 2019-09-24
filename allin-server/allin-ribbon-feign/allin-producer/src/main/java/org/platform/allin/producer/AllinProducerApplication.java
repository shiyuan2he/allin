package org.platform.allin.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author heshiyuan
 */
//@EnableHystrix
//@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class AllinProducerApplication {
	public static void main(String[] args) {
		SpringApplication.run(AllinProducerApplication.class, args);
	}
}