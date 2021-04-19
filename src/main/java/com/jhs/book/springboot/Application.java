package com.jhs.book.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

//jpa 비활성화
@EnableJpaAuditing
//SpringBootApplication 스프링 부트의 자동설정, 스프링 Bean 읽기와 생성을 모두 자동으로 설정
//@SpringBootApplication이 있는 위치부터 설정을 읽어가기 때무네 이 클래스는 항상 프로젝트의 최상단위 위치해야함
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

