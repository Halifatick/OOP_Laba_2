package com.donnu.laba2.v3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfigWithAnnotations {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfigv3.class);

        Employeev3 employee = context.getBean("employeeBean", Employeev3.class);

        employee.callYourCar();
        employee.callYourPet();

        System.out.println(employee.getName());
        System.out.println(employee.getAge());

        context.close();
    }
}
