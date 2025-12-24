package com.example.spring_boot_pratice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.server.servlet.context.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class SpringBootPraticeApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootPraticeApplication.class, args);
    }

}
