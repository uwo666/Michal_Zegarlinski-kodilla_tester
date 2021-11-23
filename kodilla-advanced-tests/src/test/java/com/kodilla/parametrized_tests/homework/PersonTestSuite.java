package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class PersonTestSuite {
    Person person = new Person(1,1);

        @ParameterizedTest
        @MethodSource(value = "com.kodilla.parametrized_tests.homework.PersonSource#providePersonForTestingBmi")
        public void shouldCalculateBmi(String input, int expected) {


        }
}