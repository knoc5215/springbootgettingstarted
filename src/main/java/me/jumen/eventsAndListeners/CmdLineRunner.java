package me.jumen.eventsAndListeners;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/* Appplication을 실행한 뒤 무언가 실행하고 싶을 때 */
@Component
public class CmdLineRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("============ CommandLineRunner class ============");
        Arrays.stream(args).forEach(System.out::println);
        System.out.println("============ CommandLineRunner class ============");

    }
}
