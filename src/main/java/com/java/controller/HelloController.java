package com.java.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/greetapi/v1/hello")
    public String displayName(@RequestParam(required = false) String name) {
        if (name != null) {
            return "Hello " + name + "!!";
        } else {
            return "Hello World!!";
        }
    }
}
