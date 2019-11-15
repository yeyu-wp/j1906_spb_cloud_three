package com.j1906;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class J1906SpbCloudEurekaserveApplication {

    public static void main(String[] args) {
        SpringApplication.run(J1906SpbCloudEurekaserveApplication.class, args);
    }

}
