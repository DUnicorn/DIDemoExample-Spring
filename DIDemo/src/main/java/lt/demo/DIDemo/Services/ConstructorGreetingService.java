package lt.demo.DIDemo.Services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService  implements GreetingService{

	@Override
	public String sayGreeting() {
		// TODO Auto-generated method stub
		return "Hello I was injected via constructor!";
	}

}
