package me.jumen.eventsAndListeners;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/* Appplication을 실행한 뒤 무언가 실행하고 싶을 때 (추천) */
@Component
@Order(1)   // 순서지정 가능
public class AppRunner implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) {
        System.out.println("============ ApplicationRunner class ============");
        System.out.println("foo : " + args.containsOption("foo"));
        System.out.println("bar : " + args.containsOption("bar")); // 앞에 --가 접두로 있어야 argument
        System.out.println("============ ApplicationRunner class ============");
    }
}
