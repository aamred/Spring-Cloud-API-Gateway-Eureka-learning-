package ua.ratespringcloud.eureka.client.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author Anton Muzhytskyi
 */

@RestController
@RequestMapping("/rclient")
public class ClientController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/rate-payment/{price}")
	public String invokePaymentService(@PathVariable int price) {
		//String url="http://localhost:8888/payment-provider/payNow/"+price;
		String url="http://R-PAYMENT-SERVICE/payment-provider/payNow/"+price;
		return restTemplate.getForObject(url, String.class);
	}
	
	@GetMapping("/test")
	public String test(){
		return "tested buy eureka gateway";
	}

}
