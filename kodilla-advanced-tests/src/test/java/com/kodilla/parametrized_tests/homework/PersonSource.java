package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class PersonSource {
    static Stream<Arguments> providePersonForTestingBmi() {
        return Stream.of(
                Arguments.of("Very severely underweight",1<15),
                Arguments.of("OtHEr ",15< 16),
                Arguments.of("E V e n t", 5),
                Arguments.of("null ", 4),
                Arguments.of("A", 1)
        );
    }
}
