package com.example.test.dto;


import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@ConfigurationProperties(prefix = "app.data.property")
@Configuration("employeeProperties")
@Getter
@Setter
public class AppProperty {

    private String emailPatter;
    private String passwordPatter;


}