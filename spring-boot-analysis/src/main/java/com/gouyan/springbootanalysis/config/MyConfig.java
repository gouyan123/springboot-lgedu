package com.gouyan.springbootanalysis.config;

import com.gouyan.springbootanalysis.model.Car;
import com.gouyan.springbootanalysis.model.Cat;
import com.gouyan.springbootanalysis.model.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
    @Bean(initMethod="init")
    public Car createCar(){
        return new Car();
    }

    @Bean
    public Dog dog(){
        return new Dog();
    }

    @Bean
    public Cat cat(){
        return new Cat();
    }
}