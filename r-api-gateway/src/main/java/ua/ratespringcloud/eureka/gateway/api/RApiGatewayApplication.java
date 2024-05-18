package ua.ratespringcloud.eureka.gateway.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class RApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(RApiGatewayApplication.class, args);
	}

}
