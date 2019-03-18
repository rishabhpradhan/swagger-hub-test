package com.rpradhan.sht;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class ShtApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShtApplication.class, args);
    }

}
