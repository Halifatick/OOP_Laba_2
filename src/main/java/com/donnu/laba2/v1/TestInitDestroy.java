package com.donnu.laba2.v1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestInitDestroy {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("laba2v1ApplicationContext.xml");

        Employeev1 employee = context.getBean("myEmployee", Employeev1.class);

        employee.callYourPet();
        employee.callYourCar();

        System.out.println(employee.getName());
        System.out.println(employee.getAge());

        context.close();
    }
}
