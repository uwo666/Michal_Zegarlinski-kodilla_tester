//package com.kodilla.bank.homework;
//
//import com.kodilla.school.Student;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//public class TransactionsTestSuit {
//    @Test
//    public void shouldCalculateCorrectBalanceIfValuesAreInRange() {
//        Transactions transaction = new Transactions(1);
//        CashMachine cashMachine = new CashMachine();
//        transaction.addTransactionDeposit(100);  // student.addHistoryGrade(5);
//        transaction.addTransactionWithdrawal(-100);
//        transaction.addTransactionDeposit(99);
//        transaction.addTransactionWithdrawal(-999);
//
//        double transactionInRange = transaction.getBalances();
//        int executedTransaction = cashMachine.getNumberOfExecutedTransactions();
//        assertEquals(90, transactionInRange);
//        assertEquals(1, executedTransaction);
//
//    }
//
//    @Test
//    public void shouldCalculateBalanceIfValuesAreOutsideRange() {
//        Transactions transaction = new Transactions(2);
//        transaction.addTransactionDeposit(0);
//        transaction.addTransactionDeposit(1000);
//        transaction.addTransactionWithdrawal(0);
//        transaction.addTransactionWithdrawal(-1000);
//
//        double transactionOutRange = transaction.getBalances();
//
//        assertEquals(0, transactionOutRange);
//    }
//
//    @Test
//    public void shouldWithdrawFromEmptyBalance() {
//        Transactions transaction = new Transactions(1);
//        CashMachine cashMachine = new CashMachine();
//        transaction.addTransactionWithdrawal(-999);
//        transaction.addTransactionWithdrawal(-999);
//        transaction.addTransactionWithdrawal(-999);
//        transaction.addTransactionWithdrawal(-999);
//        transaction.addTransactionWithdrawal(-999);
//        transaction.addTransactionWithdrawal(-999);
//        transaction.addTransactionWithdrawal(-999);
//        transaction.addTransactionWithdrawal(-999);
//        transaction.addTransactionWithdrawal(-999);
//        transaction.addTransactionWithdrawal(-999);
//        transaction.addTransactionWithdrawal(-999);
//
//        double transactionInRange = transaction.getBalances();
//        int executedTransaction = cashMachine.getNumberOfExecutedTransactions();
//        assertEquals(90, transactionInRange);
//        assertEquals(1, executedTransaction);
//    }
//}
