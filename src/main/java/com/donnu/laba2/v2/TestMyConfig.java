package com.donnu.laba2.v2;

import com.donnu.laba2.v1.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;

public class TestMyConfig {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

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
