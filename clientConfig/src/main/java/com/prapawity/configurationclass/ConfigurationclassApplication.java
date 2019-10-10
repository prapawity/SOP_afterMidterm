package com.prapawity.configurationclass;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@EnableConfigServer
@RestController
public class ConfigurationclassApplication {


    public static void main(String[] args) {
        SpringApplication.run(ConfigurationclassApplication.class, args);
    }

    @RequestMapping("/")
    String Home(){
        return "test";
    }

}
