package me.jumen.externalConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class ExternalConfigRunner implements ApplicationRunner {
    @Autowired
    JumenProperties jumenProperties;        // type-safety

    @Override
    public void run(ApplicationArguments args) {
        System.out.println("========== external config test ==========");
        System.out.println(jumenProperties.getName());
        System.out.println(jumenProperties.getAge());
        System.out.println(jumenProperties.getFullName());
        System.out.println(jumenProperties.getWorkPlace());
        System.out.println(jumenProperties.getSessionTimeout());


        System.out.println("========== external config test ==========");

    }
}
