package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class PersonSource {
    static Stream<Arguments> providePersonForTestingBmi() {
        return Stream.of(
                Arguments.of("Very severely underweight",1,15),
                Arguments.of("Severely underweight",15, 16),
                Arguments.of("Underweight", 16,18.5),
                Arguments.of("Normal (healthy weight)", 18.5,25),
                Arguments.of("Overweight", 25,30),
                Arguments.of("Obese Class I (Moderately obese)",30,35),
                Arguments.of("Obese Class II (Severely obese)", 35,40),
                Arguments.of("Obese Class III (Very severely obese)",40,45),
                Arguments.of("Obese Class IV (Morbidly Obese)", 45,50),
                Arguments.of("Obese Class V (Super Obese)", 50,60),
                Arguments.of("Obese Class VI (Hyper Obese)", 61,300)

        );
    }// przerób liczby naw\zrost i wagę
}
