package com.kodilla.bank.homework;

public class Transactions {
    private CashMachine deposit;
    private CashMachine withdrawal;
    private CashMachine balance;

    public Transactions() {
        this.deposit = new CashMachine();
        this.withdrawal = new CashMachine();
        this.balance = CashMachine.balances;


    }


    public void addTransactionDeposit(int cash){
        if(cash > 0 && cash < 1000) {
            this.deposit.add(cash);
            this.balance.add(cash);
        }
    }
    public void addTransactionWithdrawal(int cash) {
        if(getBalance() !=0 && cash > -1000 && cash <0) {
            this.withdrawal.add(cash);
            this.balance.add(cash);
        }
    }


    }
