package guru.springframework.services;

import org.springframework.stereotype.Service;

/**
 * Creted by jensW89
 */
@Service
public class GetterGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello - I was injected by the getter";
    }
}
