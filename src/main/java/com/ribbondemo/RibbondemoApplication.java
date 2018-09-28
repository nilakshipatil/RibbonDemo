package com.ribbondemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RibbonClient(name="myapp",configuration=MyAppConfiguration.class)
public class RibbondemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RibbondemoApplication.class, args);
	}
	@Bean
	@LoadBalanced
	public RestTemplate template(){
		RestTemplate template=new RestTemplate();
		return template;
	}
}
