package me.jumen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
//        SpringApplication.run(Application.class, args);

        SpringApplication app = new SpringApplication(Application.class);
        app.setBanner((environment, sourceClass, out) -> {
            out.println("================");
            out.println("Jumen Spring Boot");
            out.println("================");
        });
//        app.setBannerMode(Banner.Mode.OFF);  // 배너 OFF
        app.run(args);

        // SpringApplicationBuilder로 실행하기
        //   new SpringApplicationBuilder().sources(Application.class).run(args);

    }
}
