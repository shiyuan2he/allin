package org.platform.allin.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author heshiyuan
 */
@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages={"org.platform.allin"})
public class AllinAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(AllinAdminApplication.class, args);
	}

}

