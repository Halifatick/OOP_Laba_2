package com.donnu.laba2.v2;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("carLamba")
@Scope("prototype")
public class Lambav2 implements Carv2{
    public Lambav2() {
        System.out.println("Lamba bean was created");
    }
    @Override
    public void say() {
        System.out.println("Lamborghini");
    }
    @PostConstruct
    public void init() {
        System.out.println("Class Lamba: init method");
    }
    @PreDestroy
    public void destroy() {
        System.out.println("Class Lamba: destroy method");
    }
}
