package com.github.pixomia.spring_boot_template;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@Configuration
@EnableScheduling
@Import(SharedConfigurationReference.class)
public class SpringBootTemplateApplication {

    public static void main(final String[] args) {
	SpringApplication.run(SpringBootTemplateApplication.class, args);
    }

}
