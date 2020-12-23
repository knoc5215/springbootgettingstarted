package me.jumen.eventsAndListeners;

import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

//ApplicationContext를 만든 후 @Bean으로 등록되어 실행된다
@Component
public class ApplicationStartedListener implements ApplicationListener<ApplicationStartedEvent> {
    @Override
    public void onApplicationEvent(ApplicationStartedEvent event) {
        System.out.println("=======================");
        System.out.println("Application started");
        System.out.println("=======================");
    }
}
