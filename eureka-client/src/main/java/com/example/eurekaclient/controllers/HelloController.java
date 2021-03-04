package com.example.eurekaclient.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String greeting(){
        return "Hello to the Dineshonjava from EurekaClient";
    }
}
