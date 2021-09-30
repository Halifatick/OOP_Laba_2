package com.donnu.laba2.v2;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.donnu.laba2.v2")
@PropertySource("classpath:myApp.properties")
public class MyConfig {

}
