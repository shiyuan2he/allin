package org.platform.allin.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * 启动器
 * @author Louis
 * @date Jan 23, 2019
 */
@EnableHystrixDashboard
@EnableDiscoveryClient
@SpringBootApplication
public class AllinHystrixApplication {

	public static void main(String[] args) {
		SpringApplication.run(AllinHystrixApplication.class, args);
	}
	
}