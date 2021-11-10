package com.kodilla.collections.adv.exercises.dictionary.homework;

import com.kodilla.collections.adv.exercises.homework.FlightFinder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlightFinderTestSuit {

    @Test
    public void TestFindFlightsFrom(){
        FlightFinder flightFinder = new FlightFinder();
        flightFinder.findFlightsFrom("London");


    }
}
