package org.platform.allin.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author heshiyuan
 */
@EnableDiscoveryClient
@EnableConfigServer
@SpringBootApplication
public class AllinConfigApplication {
	public static void main(String[] args) {
		SpringApplication.run(AllinConfigApplication.class, args);
	}
}