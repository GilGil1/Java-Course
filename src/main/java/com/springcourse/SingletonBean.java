package com.springcourse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("singleton")
public class SingletonBean {
    public int x = (int) (Math.random()*1000);

    @PostConstruct
    public void init(){
        System.out.println("Method Post Ctor X:"+ x);
    }
    @PreDestroy
    public void exit()
    {
        System.out.println("Singleton is going down");
    }

}


