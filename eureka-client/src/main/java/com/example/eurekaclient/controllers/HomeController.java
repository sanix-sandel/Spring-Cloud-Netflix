/*package com.example.eurekaclient.controllers;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import com.netflix.discovery.shared.Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class HomeController {

    @Autowired
    private EurekaClient eurekaClient;

    public String serviceUrl(){
        Application application=eurekaClient.getApplication("spring-cloud-eureka-client");
        InstanceInfo instanceInfo=application.getInstances().get(0);
        String hostname=instanceInfo.getHostName();
        int port = instanceInfo.getPort();
        return instanceInfo.getHomePageUrl();
    }
}
*/