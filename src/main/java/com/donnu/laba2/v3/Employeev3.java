package com.donnu.laba2.v3;

import org.springframework.beans.factory.annotation.Value;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Employeev3 {
    private Petv3 pet;
    private Carv3 car;
    @Value("${employee.name}")
    private String name;
    @Value("${employee.age}")
    private int age;

    public void setPet(Petv3 pet) { this.pet = pet; }
    public void setCar(Carv3 car) { this.car = car; }

    public void callYourCar() {
        System.out.println("Моя машина:");
        car.say();
    }
    public void callYourPet() {
        System.out.println("Моего питомца зовут:");
        pet.say();
    }

    public void setName(String name) { this.name = name; }

    public void setAge(int age) { this.age = age; }

    public String getName() { return name; }

    public int getAge() { return age; }

    public Employeev3(Carv3 car, Petv3 pet) {
        System.out.println("Employee bean was created");
        this.pet = pet;
        this.car = car;
    }
    @PostConstruct
    public void init() {
        System.out.println("Class Employee: init method");
    }
    @PreDestroy
    public void destroy() {
        System.out.println("Class Employee: destroy method");
    }
}
