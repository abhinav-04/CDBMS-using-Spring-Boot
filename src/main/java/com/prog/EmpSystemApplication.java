package com.prog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class EmpSystemApplication {

    public static void main(String[] args) {

        SpringApplication.run(EmpSystemApplication.class, args);
    }

}
