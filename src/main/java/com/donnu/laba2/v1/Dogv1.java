package com.donnu.laba2.v1;

public class Dogv1 implements Petv1 {
    public Dogv1() {
        System.out.println("Dog bean was created");
    }

    @Override
    public void say() {
        System.out.println("Шарик");
    }

    public void init() {
        System.out.println("Class Dog: init method");
    }

    public void destroy() {
        System.out.println("Class Dog: destroy method");
    }
}
