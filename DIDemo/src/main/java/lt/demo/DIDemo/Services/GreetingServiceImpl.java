package lt.demo.DIDemo.Services;

import org.springframework.stereotype.Service;

/*
 * Also picked up as a Spring component
 */
@Service
public class GreetingServiceImpl implements GreetingService{
	
	public static final String HELLO_WORLD ="Hello World!!!!";

	@Override
	public String sayGreeting() {
		return HELLO_WORLD;
	}

}
