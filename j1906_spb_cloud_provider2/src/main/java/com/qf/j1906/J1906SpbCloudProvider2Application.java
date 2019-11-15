package com.qf.j1906;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class J1906SpbCloudProvider2Application {

    public static void main(String[] args) {
        SpringApplication.run(J1906SpbCloudProvider2Application.class, args);
    }

}
