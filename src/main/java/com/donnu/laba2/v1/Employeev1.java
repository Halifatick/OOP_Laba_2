package com.donnu.laba2.v1;

public class Employeev1 {
    private Petv1 pet;
    private Carv1 car;
    private String name;
    private int age;

    public void setPet(Petv1 pet) { this.pet = pet; }
    public void setCar(Carv1 car) { this.car = car; }

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

    public Employeev1() {
        System.out.println("Employee bean was created");
    }

    public void init() {
        System.out.println("Class Employee: init method");
    }

    public void destroy() {
        System.out.println("Class Employee: destroy method");
    }
}
