package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class CarFactory {

    @Bean
    public Car createCar(Seasons seasons) {
        Map<Seasons, Car> seasonsForCar = new HashMap<>();
        seasonsForCar.put(Seasons.SUMMER, new Cabrio());
        seasonsForCar.put(Seasons.AUTUMN, new Sedan());
        seasonsForCar.put(Seasons.WINTER, new SUV());
        seasonsForCar.put(Seasons.SPRING, new Sedan());


        return seasonsForCar.get(seasons);
    }

    enum Seasons {
        SPRING,
        SUMMER,
        AUTUMN,
        WINTER;
    }

    @Bean
    public String createCar2(Seasons seasons) {
        if (seasons == Seasons.SPRING) {
            return new Cabrio().getCarType();
        } else if (seasons == Seasons.AUTUMN || seasons == Seasons.SPRING) {
            return new Sedan().getCarType();
        }else return new SUV().getCarType();

    }
}
