package com.donnu.laba2.v1;

public class Lambav1 implements Carv1{
    public Lambav1() {
        System.out.println("Lamba bean was created");
    }
    @Override
    public void say() {
        System.out.println("Lamborghini");
    }

    public void init() {
        System.out.println("Class Lamba: init method");
    }

    public void destroy() {
        System.out.println("Class Lamba: destroy method");
    }
}
