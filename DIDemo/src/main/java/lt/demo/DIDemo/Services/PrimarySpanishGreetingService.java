package lt.demo.DIDemo.Services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("es")
@Primary
public class PrimarySpanishGreetingService implements GreetingService{

	@Override
	public String sayGreeting() {
		return "Serviceio de Saludo Primario";
	}

}
