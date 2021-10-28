package com.kodilla.bank.homework;
import com.kodilla.school.Grades;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {
    @Test
    public void shouldHaveZeroLength() {
        CashMachine machine = new CashMachine();

        assertEquals(0, machine.getNumberOfExecutedTransactions());
    }

    @Test
    public void shouldAddTwoElementsToArray() {
        CashMachine machine = new CashMachine();
        machine.add(492);
        machine.add(-234);

        int values = machine.getNumberOfExecutedTransactions();
        assertEquals(2, values);

    }

    @Test
    public void shouldCalculateBalance() {
        CashMachine machine = new CashMachine();
        machine.add(400);
        machine.add(200);
        machine.add(-200);
        machine.add (-400);
        machine.add(1000);

        assertEquals(11000, machine.balances(), 0.01);
    }

    @Test
    public void shouldReturnBalance10000WhenArrayIsEmpty() {
        CashMachine machine = new CashMachine();
        assertEquals(10000, machine.balances(), 0.01);
    }
}
