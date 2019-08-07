package org.platform.allin.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;

/**
 * @author heshiyuan
 */
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class AllinConsumerApplication {
	
    public static void main(String[] args) {
        SpringApplication.run(AllinConsumerApplication.class, args);
    }
}