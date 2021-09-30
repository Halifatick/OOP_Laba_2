package com.donnu.laba2.v3;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Dogv3 implements Petv3 {
    public Dogv3() {
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
