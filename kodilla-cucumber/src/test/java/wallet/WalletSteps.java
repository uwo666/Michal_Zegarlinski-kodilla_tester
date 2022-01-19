package wallet;

import io.cucumber.java8.En;
import org.junit.Assert;

public class WalletSteps implements En {

    private Wallet wallet = new Wallet();
    private CashSlot cashSlot = new CashSlot();
    private Cashier cashier = new Cashier(cashSlot);

    public WalletSteps() {


        Given("I have deposited $200 in my wallet", () -> {
//            Wallet wallet = new Wallet();
            wallet.deposit(200);
            Assert.assertEquals("Incorrect wallet balance",200, wallet.getBalance());
//            throw new io.cucumber.java8.PendingException();
        });

        When("I request $30", () -> {
            cashier.withdraw(wallet, 30);
//            throw new io.cucumber.java8.PendingException();
        });

        Then("$30 should be dispensed", () -> {
        Assert.assertEquals(30, cashSlot.getContents());
//            throw new io.cucumber.java8.PendingException();
        });

        Then("the balance of my wallet should be $170", () -> {
            // Write code here that turns the phrase above into concrete actions
            throw new io.cucumber.java8.PendingException();
        });

//        Given("I have deposited 100 in my wallet", () -> {
//            wallet.deposit(100);
//            throw new io.cucumber.java8.PendingException();
//        });
//
//        When("I request 100", () -> {
//            cashier.withdraw(wallet, 100);
//            throw new io.cucumber.java8.PendingException();
//        });
//
//        Then("$100 should be dispensed", () -> {
//            Assert.assertEquals(100, cashSlot.getContents());
//            throw new io.cucumber.java8.PendingException();
//        });
//
//        Given("I have deposited 300 in my wallet", () -> {
//            wallet.deposit(300);
//            throw new io.cucumber.java8.PendingException();
//        });
//
//        When("I request 0", () -> {
//            cashier.withdraw(wallet, 0);
//            throw new io.cucumber.java8.PendingException();
//        });
//
//        Then("$0 should be dispensed", () -> {
//            Assert.assertEquals(0, cashSlot.getContents());
//            throw new io.cucumber.java8.PendingException();
//        });
//
//        Given("I have deposited {int} in my wallet", () -> {
//            wallet.deposit(0);
//            throw new io.cucumber.java8.PendingException();
//        });
//
//        When("I request {int}", () -> {
//            cashier.withdraw(wallet, 0);
//            throw new io.cucumber.java8.PendingException();
//        });
//
//        Then("{int} should be dispensed", () -> {
//            Assert.assertEquals(0, cashSlot.getContents());
//            throw new io.cucumber.java8.PendingException();
//        });

    }
}
