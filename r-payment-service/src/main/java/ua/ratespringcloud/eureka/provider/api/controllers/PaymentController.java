package ua.ratespringcloud.eureka.provider.api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Anton Muzhytskyi
 */

@RestController
@RequestMapping("/payment-provider")
public class PaymentController {

	@GetMapping("/payNow/{price}")
	public String  payNow(@PathVariable int price) {
		return "payment amount" + price + "is successfull";
	}
}

//commit
