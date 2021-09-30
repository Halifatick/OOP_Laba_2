package com.donnu.laba2.v1;

public class Catv1 implements Petv1 {
    public Catv1() {
        System.out.println("Cat bean was created");
    }

    @Override
    public void say() {
        System.out.println("Персик");
    }

    public void init() {
        System.out.println("Class Cat: init method");
    }

    public void destroy() {
        System.out.println("Class Cat: destroy method");
    }
}
