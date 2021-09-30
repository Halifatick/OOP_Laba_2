package com.donnu.laba2.v3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

@Configuration
@PropertySource("classpath:myApp.properties")
public class MyConfigv3 {

    @Bean
    @Scope("singleton")
    public Carv3 BMWBean() {
        return new BMWv3();
    }

    @Bean
    @Scope("singleton")
    public Carv3 lambaBean() {
        return new Lambav3();
    }

    @Bean
    @Scope("singleton")
    public Petv3 catBean() {
        return new Catv3();
    }

    @Bean
    @Scope("singleton")
    public Petv3 dogBean() {
        return new Dogv3();
    }

    @Bean
    @Scope("singleton")
    public Employeev3 employeeBean() {
        return new Employeev3(BMWBean(),catBean());
    }
}
