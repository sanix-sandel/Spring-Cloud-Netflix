package com.example.feignclient.services;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("spring-cloud-client")
public interface HelloServiceClient {

    @GetMapping("/hello")
    String sayHello();
}
