package com.donnu.laba2.v3;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Catv3 implements Petv3 {
    public Catv3() {
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
