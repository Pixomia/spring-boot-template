package com.github.pixomia.gittertester;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@Configuration
@EnableScheduling
public class GittertesterApplication {

    public static void main(final String[] args) {
	SpringApplication.run(GittertesterApplication.class, args);
    }

}
