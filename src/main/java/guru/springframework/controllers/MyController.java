package guru.springframework.controllers;

import org.springframework.stereotype.Controller;

/**
 * Creted by jensW89
 */
@Controller
public class MyController {

    public String hello(){
        System.out.println("Hello!!!");
        return "foo";
    }
}
