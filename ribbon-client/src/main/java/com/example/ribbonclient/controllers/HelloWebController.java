package com.example.ribbonclient.controllers;

import com.example.ribbonclient.services.HelloServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWebController {

    @Autowired
    HelloServiceClient helloServiceClient;

    @GetMapping("/say-hello")
    public String sayHello(ModelMap model){
        model.put("message", helloServiceClient.sayHello());
        System.out.println("HELLO");
        return "hello";
    }
}
