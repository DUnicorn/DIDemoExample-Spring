package lt.demo.DIDemo.Controllers;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import lt.demo.DIDemo.Services.GreetingServiceImpl;

public class SetterInjectedControllerTest {
	private SetterInjectedController setterInjectedController;
	
	@Before
	public void setUp() throws Exception {
		this.setterInjectedController = new SetterInjectedController();
		this.setterInjectedController.setGreetingService (new GreetingServiceImpl());
	}
	
	@Test
	public void testGreeting() throws Exception {
		assertEquals (GreetingServiceImpl.HELLO_WORLD, setterInjectedController.sayHello());
	}
	

}
