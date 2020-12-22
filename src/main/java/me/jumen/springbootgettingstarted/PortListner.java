package me.jumen.springbootgettingstarted;

import org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext;
import org.springframework.boot.web.servlet.context.ServletWebServerInitializedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class PortListner implements ApplicationListener<ServletWebServerInitializedEvent> {
    // 웹서버가 초기화되면, 이 부분이 콜백으로 호출된다
    @Override
    public void onApplicationEvent(ServletWebServerInitializedEvent event) {
        ServletWebServerApplicationContext applicationContext = event.getApplicationContext();
        System.out.println(applicationContext.getWebServer().getPort());
    }
}
