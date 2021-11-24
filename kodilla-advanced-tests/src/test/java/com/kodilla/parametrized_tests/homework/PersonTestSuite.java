package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class PersonTestSuite {
    Person person = new Person(162,44);

        @ParameterizedTest
        @MethodSource(value = "com.kodilla.parametrized_tests.homework.PersonSource#providePersonForTestingBmi")
        public void shouldCalculateBmi(String input, int height, int weight) {
            Person person = new Person(height, weight);
            assertEquals(input, person.getBMI());

        }
}

// assertEquals(expected, manipulator.getStringLengthWithoutSpaces(input));