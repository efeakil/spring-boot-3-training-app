package com.codesnitch.demo.myapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    
    //inject properties
    @Value("${coder.nickname}")
    private String coderNickname;

    @Value("${coder.team}")
    private String coderTeam;

    //expose '/teaminfo'

    @GetMapping("/teaminfo")
    public String teamInfo(){
        return "Hello " + coderNickname + ", " + coderTeam + " is your Team!"  ;
    }

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
