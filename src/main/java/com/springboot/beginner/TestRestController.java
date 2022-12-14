package com.springboot.beginner;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class TestRestController {

    @GetMapping("/")
    public String sayHello() {

        return "Hello World! Time on server is " + LocalDateTime.now();
    }
    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "Run a hard 5k!";
    }
}
