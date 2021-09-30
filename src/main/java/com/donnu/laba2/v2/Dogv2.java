package com.donnu.laba2.v2;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("petDog")
@Scope("prototype")
public class Dogv2 implements Petv2 {
    public Dogv2() {
        System.out.println("Dog bean was created");
    }

    @Override
    public void say() {
        System.out.println("Шарик");
    }
    @PostConstruct
    public void init() {
        System.out.println("Class Dog: init method");
    }
    @PreDestroy
    public void destroy() {
        System.out.println("Class Dog: destroy method");
    }
}
