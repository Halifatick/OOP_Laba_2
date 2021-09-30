package com.donnu.laba2.v1;

public class BMWv1 implements Carv1{
    public BMWv1() {
        System.out.println("BMW bean was created");
    }

    @Override
    public void say() {
        System.out.println("BMW");
    }

    public void init() {
        System.out.println("Class BMW: init method");
    }

    public void destroy() {
        System.out.println("Class BMW: destroy method");
    }
}
