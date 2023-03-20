package com.xj.springaop;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @description:
 * @author：肖杰
 * @date: 2023-03-19
 */
@SpringBootApplication
@Configurable
public class SpringAOPApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringAOPApplication.class, args);
//        System.out.println("test");
    }
}
