package me.jumen.springbootgettingstarted;

import me.jumen.Holoman;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/* 자동설정 커스터마징 테스트 autoConfiguration */
@Component
public class HolomanRunner implements ApplicationRunner {

    @Autowired
    Holoman holoman;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(holoman.toString());
    }
}
