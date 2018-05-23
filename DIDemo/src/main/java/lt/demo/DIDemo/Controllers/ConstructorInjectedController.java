package lt.demo.DIDemo.Controllers;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import lt.demo.DIDemo.Services.GreetingService;

@Controller
public class ConstructorInjectedController {
	
	private GreetingService greetingService;

	//bean name for Qualifier
	public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	public String sayHello() {
		return greetingService.sayGreeting();
	}
	
}
