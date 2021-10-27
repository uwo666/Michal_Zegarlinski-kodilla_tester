package com.kodilla.bank.homework;

public class Bank {

    private CashMachine[] cashMachines;
    private int size;


    public Bank() {
        this.size = 0;
        this.cashMachines = new CashMachine[0];

    }

    public void add(CashMachine value) {
        this.size++;
        CashMachine[] newTab = new CashMachine[this.size];
        System.arraycopy(cashMachines, 0, newTab, 0, cashMachines.length);
        newTab[this.size - 1] = value;
        this.cashMachines = newTab;
    }
}
