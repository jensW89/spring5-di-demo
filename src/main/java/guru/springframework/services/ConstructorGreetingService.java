package guru.springframework.services;

import org.springframework.stereotype.Service;

/**
 * Creted by jensW89
 */
@Service
public class ConstructorGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello - i was injected via the constructor!!!";
    }
}
