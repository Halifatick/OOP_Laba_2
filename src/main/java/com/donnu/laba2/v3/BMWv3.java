package com.donnu.laba2.v3;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class BMWv3 implements Carv3{

    public BMWv3() {
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
