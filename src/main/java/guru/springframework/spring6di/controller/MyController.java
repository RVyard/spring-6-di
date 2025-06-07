package guru.springframework.spring6di.controller;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String sayHello(){
        System.out.println("I am in controller");

        return "Hi there";
    }

}
