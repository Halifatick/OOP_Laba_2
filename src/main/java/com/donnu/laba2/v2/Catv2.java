package com.donnu.laba2.v2;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("petCat")
@Scope("singleton")
public class Catv2 implements Petv2 {
    public Catv2() {
        System.out.println("Cat bean was created");
    }

    @Override
    public void say() {
        System.out.println("Персик");
    }
    @PostConstruct
    public void init() {
        System.out.println("Class Cat: init method");
    }
    @PreDestroy
    public void destroy() {
        System.out.println("Class Cat: destroy method");
    }
}
