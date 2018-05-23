package lt.demo.DIDemo.Controllers;

import org.springframework.stereotype.Controller;

import lt.demo.DIDemo.Services.GreetingService;

/*Marked as Controller that created it as a spring bean or
 * indicated that is the spring bean.
 * 
 */
@Controller
public class MyController {

	private GreetingService greetingService;

	public MyController(GreetingService greetingService) {
		super();
		this.greetingService = greetingService;
	}

	public String hello() {
		System.out.println("Hello!!!");
		return greetingService.sayGreeting();
	}
}
