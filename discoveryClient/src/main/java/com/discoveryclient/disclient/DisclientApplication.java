package com.discoveryclient.disclient;

import com.discoveryclient.disclient.model.ServiceDiscoveryClient;
import com.discoveryclient.disclient.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class DisclientApplication {
    @Autowired
    public ServiceDiscoveryClient serviceDiscoveryClient;
    public static void main(String[] args) {
        SpringApplication.run(DisclientApplication.class, args);
    }
    @RequestMapping("/home")
    Student Home(){
        return serviceDiscoveryClient.getStudent("01");
    }
}
