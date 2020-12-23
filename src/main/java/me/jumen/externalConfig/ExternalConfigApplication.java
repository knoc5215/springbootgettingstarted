package me.jumen.externalConfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExternalConfigApplication {


    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(ExternalConfigApplication.class);
        app.run(args);
    }


}
