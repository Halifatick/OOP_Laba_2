package com.donnu.laba2.v2;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("carBMW")
@Scope("singleton")
public class BMWv2 implements Carv2{

    public BMWv2() {
        System.out.println("BMW bean was created");
    }

    @Override
    public void say() {
        System.out.println("BMW");
    }

    @PostConstruct
    public void init() {
        System.out.println("Class BMW: init method");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Class BMW: destroy method");
    }
}
