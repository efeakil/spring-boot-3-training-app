package com.codesnitch.demo.myapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    
    // expose '/' that return Hello World
    @GetMapping("/")
    public String sayHello(){
        return "Hello World!";
    }

    //expose new endpoint for testing devtools
    @GetMapping("/workout")
    public String dailyWorkout(){
        return "Run a hard 5k!";
    }
}
