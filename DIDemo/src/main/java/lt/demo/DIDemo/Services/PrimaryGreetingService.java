package lt.demo.DIDemo.Services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
/*
 * if there is more than one bean, I want to use this one
 */
@Profile({"en","default"})
public class PrimaryGreetingService implements GreetingService{

	@Override
	public String sayGreeting() {
		return "Hello - from the Primary Greeting service";
	}

}
