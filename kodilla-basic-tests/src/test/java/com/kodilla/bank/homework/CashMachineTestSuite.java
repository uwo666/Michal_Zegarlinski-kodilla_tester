package com.kodilla.bank.homework;

import com.kodilla.school.Grades;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {
    @Test
    public void shouldHaveZeroLength() {
        CashMachine machine = new CashMachine();
        int[] values = machine.getValues();
        assertEquals(0, values.length);
    }

    @Test
    public void shouldAddTwoElementsToArray() {
        CashMachine machine = new CashMachine();
        machine.add(492);
        machine.add(-2342);

        int[] values = machine.getValues();
        assertEquals(2, values.length);
        assertEquals(492, values[0]);
        assertEquals(-2342, values[1]);
    }
}
