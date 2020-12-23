package me.jumen.externalConfig;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;
import java.time.Duration;

/*
타입-세이프 프로퍼티 @ConfigurationProperties
여러 프로퍼티를 묶어서 읽어올 수 있음
빈으로 등록해서 다른 빈에 주입할 수 있음
 */
@Component
@ConfigurationProperties("jumen")
@Validated // JSR-303
public class JumenProperties {

    @NotEmpty
    private String name;

    @Min(1)
    @Max(100)
    private int age;

    @NotEmpty
    private String fullName;

    private String workPlace;   // 융통성 있는 바인딩. context-path, context_path, contextPath, CONTEXTPATH

    //    @DurationUnit(ChronoUnit.SECONDS) conversion service
    private Duration sessionTimeout = Duration.ofSeconds(30);

    public Duration getSessionTimeout() {
        return sessionTimeout;
    }

    public void setSessionTimeout(Duration sessionTimeout) {
        this.sessionTimeout = sessionTimeout;
    }

    public String getWorkPlace() {
        return workPlace;
    }

    public void setWorkPlace(String workPlace) {
        this.workPlace = workPlace;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
