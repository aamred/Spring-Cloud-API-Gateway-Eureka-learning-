package ua.ratespringcloud.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class RDiscoveryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RDiscoveryServiceApplication.class, args);
	}

}
