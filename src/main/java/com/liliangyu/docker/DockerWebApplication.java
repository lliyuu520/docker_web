package com.liliangyu.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * springboot启动器
 */
@EnableAutoConfiguration
@SpringBootApplication
public class DockerWebApplication {
    public static void main(String[] args) {
        SpringApplication.run(DockerWebApplication.class, args);
    }

}
