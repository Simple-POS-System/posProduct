package com.ead.posproduct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class PosProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(PosProductApplication.class, args);
    }

}
