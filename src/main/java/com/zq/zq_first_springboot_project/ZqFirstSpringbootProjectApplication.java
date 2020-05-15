package com.zq.zq_first_springboot_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class ZqFirstSpringbootProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZqFirstSpringbootProjectApplication.class, args);
        System.out.printf(Thread.currentThread().getName());
    }

////thisgit
}
