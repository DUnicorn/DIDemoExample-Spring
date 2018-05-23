package lt.demo.DIDemo.Controllers;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import lt.demo.DIDemo.Services.GreetingServiceImpl;

public class ConstructorInjectedControllerTest {
	
	private ConstructorInjectedController constructorInjectedController;
	
	@Before
	public void setUp() throws Exception{
		this.constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
	}
	
	@Test 
	public void testGreeting () throws Exception {
		assertEquals(GreetingServiceImpl.HELLO_WORLD, constructorInjectedController.sayHello());
	}


}
