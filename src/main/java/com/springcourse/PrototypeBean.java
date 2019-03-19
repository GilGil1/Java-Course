package com.springcourse;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("prototype")
public class PrototypeBean {
    public int x = (int) (Math.random()*1000);

    @PostConstruct
    public void init(){
        System.out.println("Method Post Ctor X:"+ x);
    }


    @Bean
    @Primary // Set as the primaty bean creation method
    public PrototypeBean proto6 (){
        PrototypeBean b = new PrototypeBean();
        b.x = 6;
        return b;
    }
}


