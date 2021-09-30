package com.donnu.laba2.v3;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Lambav3 implements Carv3{
    public Lambav3() {
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
