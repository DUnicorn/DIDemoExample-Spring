package lt.demo.DIDemo.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import lt.demo.DIDemo.Services.GreetingServiceImpl;

/*Mark as Spring component.
 * Manage as a Spring bean.
 */
@Controller
public class PropertyInjectedController {
	
	@Autowired
	@Qualifier("greetingServiceImpl")
	public GreetingServiceImpl greetingService;

	public String sayHello() {
		return greetingService.sayGreeting();
	}
	
}
