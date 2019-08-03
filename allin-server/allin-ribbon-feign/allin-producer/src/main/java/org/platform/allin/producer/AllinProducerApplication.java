package org.platform.allin.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author heshiyuan
 */
@EnableDiscoveryClient
@SpringBootApplication
public class AllinProducerApplication {
	public static void main(String[] args) {
		SpringApplication.run(AllinProducerApplication.class, args);
	}
}