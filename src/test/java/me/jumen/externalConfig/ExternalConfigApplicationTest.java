package me.jumen.externalConfig;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.TestPropertySource;

import static org.assertj.core.api.Assertions.assertThat;

@TestPropertySource(locations = "classpath:/test.properties")   // 프로퍼티 우선순위 참고. 이건 2순위
@SpringBootTest
class ExternalConfigApplicationTest {

    @Autowired
    Environment environment;


    @Test
    public void contextLoads() {
        assertThat(environment.getProperty("jumen.fullname"))
                .isEqualTo("WON JU YOUNG");    // @TestPropertySource
    }

}