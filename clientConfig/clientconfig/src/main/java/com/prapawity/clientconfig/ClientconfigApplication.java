package com.prapawity.clientconfig;

import com.prapawity.clientconfig.model.ServiceConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ClientconfigApplication {

    @Autowired
    private ServiceConfig serviceConfig;

    public static void main(String[] args) {
        SpringApplication.run(ClientconfigApplication.class, args);
    }


    @RequestMapping("/")
    public String pet(){
        return serviceConfig.getExampleProperty();
    }


}
