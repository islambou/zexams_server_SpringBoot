package com.zsoft.zexams;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
public class ZexamsApplication {


    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(ZexamsApplication.class);
    }

    public static void main(String[] args) {

        SpringApplication.run(ZexamsApplication.class, args);
    }
}
