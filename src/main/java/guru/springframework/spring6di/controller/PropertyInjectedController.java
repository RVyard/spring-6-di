package guru.springframework.spring6di.controller;

import guru.springframework.spring6di.service.GreetingService;
import org.springframework.stereotype.Controller;


public class PropertyInjectedController {

    GreetingService greetingService;

    public String sayHello(){
        return  greetingService.sayGreeting();
    }
}
