package com.prapawity.clientconfig.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ServiceConfig {
    @Value("${name.first}")
    private String exampleProperty;
    public String getExampleProperty() {
        return exampleProperty;
    }
}
