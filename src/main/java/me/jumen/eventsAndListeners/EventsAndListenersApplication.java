package me.jumen.eventsAndListeners;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EventsAndListenersApplication {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(EventsAndListenersApplication.class);

        /*  ApplicationListener<ApplicationStartingEvent> 등록은 addListener로 한다  */
        app.addListeners(new ApplicationStartingListener());

         /*
        1. Servlet이 있냐없냐
        Servlet이 존재하면 자동으로 WebApplicationType.SERVLET으로 실행된다
        2. WebFlux가 있냐없냐
        WebFlux가 존재하면 자동으로 WebApplicationType.REACTICE로 실행된다
        3. 둘 다 있냐
        둘 다 있다면 WebApplicationType.SERVLET으로 실행된다
        명시적으로 REACTIVE 실행 가능하다
         */
        app.setWebApplicationType(WebApplicationType.SERVLET);

        app.run(args);
    }
}
