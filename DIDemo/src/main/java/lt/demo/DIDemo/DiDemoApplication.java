package lt.demo.DIDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import lt.demo.DIDemo.Controllers.ConstructorInjectedController;
import lt.demo.DIDemo.Controllers.MyController;
import lt.demo.DIDemo.Controllers.PropertyInjectedController;
import lt.demo.DIDemo.Controllers.SetterInjectedController;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {
		/*Loaded up context
		 * 
		 */
		ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);
		
		//Ask the context to give a bean called myController
		MyController controller = (MyController) ctx.getBean("myController");
		
		
		System.out.println(controller.hello());
		System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
		System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
		System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
	}
}
