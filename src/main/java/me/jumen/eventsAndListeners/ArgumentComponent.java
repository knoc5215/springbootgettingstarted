package me.jumen.eventsAndListeners;

import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

@Component
public class ArgumentComponent {

    /* 어떤 bean에 생성자가 1개이고, 그 생성자의 parameter가 bean일 경우에는 스프링이 알아서 주입해준다 */
    public ArgumentComponent(ApplicationArguments arguments) {
        System.out.println("foo : " + arguments.containsOption("foo"));
        System.out.println("bar : " + arguments.containsOption("bar")); // 앞에 --가 접두로 있어야 argument

    }
}
