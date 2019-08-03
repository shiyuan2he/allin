package org.platform.allin.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class AllinZuulApplication {
	public static void main(String[] args) {
		SpringApplication.run(AllinZuulApplication.class, args);
	}
}