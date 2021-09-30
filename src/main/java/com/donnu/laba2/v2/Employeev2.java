package com.donnu.laba2.v2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("employee")
@Scope("singleton")
public class Employeev2 {
    @Autowired
    @Qualifier("petCat")
    private Petv2 pet;
    @Autowired
    @Qualifier("carBMW")
    private Carv2 car;
    @Value("${employee.name}")
    private String name;
    @Value("${employee.age}")
    private int age;

    public void setPet(Petv2 pet) { this.pet = pet; }
    public void setCar(Carv2 car) { this.car = car; }

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

    // Вариант конструктора Employee с анотациями Autowired и Qualifier
   /* @Autowired
    public Employeev2(@Qualifier("petCat")Petv2 pet, @Qualifier("carBMW")Carv2 car) {
        System.out.println("Employee bean was created");
        this.pet = pet;
        this.car = car;
    }
    */

    public Employeev2() {
        System.out.println("Employee bean was created");
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
