package org.platform.allin.turbine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * 启动器
 * @author Louis
 * @date Jan 23, 2019
 */
@EnableHystrixDashboard
@EnableTurbine
@EnableDiscoveryClient
@SpringBootApplication
public class AllinTurbineApplication {
	public static void main(String[] args) {
		SpringApplication.run(AllinTurbineApplication.class, args);
	}
}