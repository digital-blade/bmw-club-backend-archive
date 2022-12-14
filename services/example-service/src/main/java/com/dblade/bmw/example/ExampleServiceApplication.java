package com.dblade.bmw.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ExampleServiceApplication {
  public static void main(String[] args) {
    SpringApplication.run(ExampleServiceApplication.class, args);
  }
}
