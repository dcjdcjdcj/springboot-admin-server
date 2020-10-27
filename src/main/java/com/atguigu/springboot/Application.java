package com.atguigu.springboot;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);

        System.out.println("2");
        System.out.println("1");
        System.out.println("3");
        System.out.println("4");

        System.out.println("5");
        System.out.println("6");
    }
}
