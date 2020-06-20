package com.example.springbootsystemstudy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class SpringbootsystemstudyApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootsystemstudyApplication.class, args);
    }

}
