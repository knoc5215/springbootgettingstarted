package me.jumen.externalConfig;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class ExternalConfigRunner implements ApplicationRunner {

    private Logger logger = LoggerFactory.getLogger(ExternalConfigRunner.class);

    @Autowired
    JumenProperties jumenProperties;        // type-safety

    @Autowired
    private String hello;

    @Override
    public void run(ApplicationArguments args) {
        logger.debug("========== external config test ==========");
        logger.debug(jumenProperties.getName());
//        logger.info(jumenProperties.getAge());
        logger.debug(jumenProperties.getFullName());
        logger.debug(jumenProperties.getWorkPlace());
//        logger.info(jumenProperties.getSessionTimeout());

        logger.debug(hello);


        logger.info("========== external config test ==========");

    }
}
