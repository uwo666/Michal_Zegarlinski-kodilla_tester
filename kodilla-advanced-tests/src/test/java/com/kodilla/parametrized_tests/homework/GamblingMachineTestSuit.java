package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GamblingMachineTestSuit {
    public GamblingMachine gamblingMachine = new GamblingMachine();

    @ParameterizedTest
    @CsvFileSource(resources = "/intUserNumbers.csv", numLinesToSkip = 1)
    public void testTrue(int number1, int number2, int number3, int number4, int number5, int number6, int result) throws InvalidNumbersException {
        Set<Integer> input = new HashSet<>();


        input.add(number1);
        input.add(number2);
        input.add(number3);
        input.add(number4);
        input.add(number5);
        input.add(number6);
        assertEquals(gamblingMachine.howManyWins(input), result);

    }

//    @ParameterizedTest
//    @CsvFileSource(resources = "/intZeroAndNegative.csv")
//    public void shouldReturnExceptionForZeroAndNegativeValue(String testNumbers) {
//        Assertions.assertThrows(InvalidNumbersException.class, () -> {
//
//
//        }
//    }

}













