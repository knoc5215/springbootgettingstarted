package me.jumen.springbootgettingstarted;

import me.jumen.Holoman;
import me.jumen.HolomanConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@Configuration
//@ComponentScan    // 빈 등록 1단계 : @Component 스캔해서 bean으로 등록
//@EnableAutoConfiguration  // 빈 등록 2단계
public class SpringbootgettingstartedApplication {

/*
    @ComponentScan - 빈 등록 1단계 과정에서 등록
    @EnableAutoConfiguration 2단계 과정에서 충돌이 나지만,
    HolomanConfiguration class의 constructor에 @ConditionalOnMissingBean을 기입하면
    아래 bean이 1단계 과정에서 이미 생성되었음으로 다시 덮어쓰지 않는다.

    @Bean
    public Holoman holoman() {
        Holoman holoman = new Holoman();
        holoman.setName("주영");
        holoman.setHowLong(100);
        return holoman;
    }*/

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(SpringbootgettingstartedApplication.class);
        application.setWebApplicationType(WebApplicationType.NONE);
        application.run(args);
    }

}