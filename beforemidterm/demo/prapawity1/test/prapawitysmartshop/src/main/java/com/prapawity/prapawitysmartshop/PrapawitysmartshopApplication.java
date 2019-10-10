package com.prapawity.prapawitysmartshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
//@EnableAutoConfiguration
public class PrapawitysmartshopApplication {

    public static void main(String[] args) {
        SpringApplication.run(PrapawitysmartshopApplication.class, args);
    }
    @RequestMapping("/")
    String Home(){
        return "Home<button>TEST</button>";
    }

    @RequestMapping("/method")
    String Cart(){
        return "Cart<button>TEST</button>";
    }

}
