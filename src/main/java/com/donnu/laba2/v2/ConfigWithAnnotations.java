package com.donnu.laba2.v2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;

public class ConfigWithAnnotations {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("laba2v2ApplicationContext.xml");

        // анотация Autowired и Qualifier и Component и PostConstruct и PreDestroy
        Employeev2 employee = context.getBean("employee", Employeev2.class);
        employee.callYourPet();
        employee.callYourCar();
        // анотация Value
        System.out.println(employee.getName());
        System.out.println(employee.getAge());
        // анотация Scope (singleton)
        int count = 10;

        ArrayList<Carv2> bmwList = new ArrayList<Carv2>(count);

        for (int x = 0; x < count; x++) {
            bmwList.add(context.getBean("carBMW", BMWv2.class));
        }
        // анотация Scope (prototype)
        ArrayList<Carv2> lambaList = new ArrayList<Carv2>(count);

        for (int x = 0; x < count; x++) {
            lambaList.add(context.getBean("carLamba", Lambav2.class));
        }

        context.close();
    }
}
