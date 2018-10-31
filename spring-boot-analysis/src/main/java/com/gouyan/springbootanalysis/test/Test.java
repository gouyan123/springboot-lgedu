package com.gouyan.springbootanalysis.test;

import com.gouyan.springbootanalysis.model.Car;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.gouyan.springbootanalysis");
        Car car = context.getBean(Car.class);
        System.err.println(car);
        context.close();
    }
}