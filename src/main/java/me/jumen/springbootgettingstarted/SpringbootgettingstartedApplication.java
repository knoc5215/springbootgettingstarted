package me.jumen.springbootgettingstarted;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@SpringBootApplication
//@Configuration
//@ComponentScan    // 빈 등록 1단계 : @Component 스캔해서 bean으로 등록
//@EnableAutoConfiguration  // 빈 등록 2단계
public class SpringbootgettingstartedApplication {

/*
    @ComponentScan - 빈 등록 1단계 과정에서 등록
    @EnableAutoConfiguration 2단계 과정에서 충돌이 나지만,
    HolomanConfiguration class의 constructor에 @ConditionalOnMissingBean을 기입하면
    아래 bean이 1단계 과정에서 이미 생성되었음으로 다시 덮어쓰지 않는다.

    @Bean
    public Holoman holoman() {
        Holoman holoman = new Holoman();
        holoman.setName("주영");
        holoman.setHowLong(100);
        return holoman;
    }*/

    public static void main(String[] args) {
        /*
        톰캣 서블릿 등록 테스트
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8080);
        Context context = tomcat.addContext("/", "/");

        HttpServlet servlet = new HttpServlet() {
            @Override
            protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
                PrintWriter writer = resp.getWriter();
                writer.println("<html><head><title>");
                writer.println("Hey, Tomcat");
                writer.println("</title></head>");
                writer.println("<body><h1>Hello Tomcat</h1></body>");
                writer.println("</html>");
            }
        };
        String servletName = "helloServlet";
        tomcat.addServlet("/", servletName, servlet);
        context.addServletMappingDecoded("/hello", servletName);

        tomcat.start();
        tomcat.getServer().await();
        */

        SpringApplication.run(SpringbootgettingstartedApplication.class, args);
    }

}