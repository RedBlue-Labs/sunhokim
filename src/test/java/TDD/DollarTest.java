package TDD;

import TDD.*;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DollarTest {

    @Test
    public void testCurrencyExchange() {
        Bank bank = new Bank();
        bank.addRate("USD", "GBP", 2);
        bank.commission(0.015);
        Money result = bank.convert(new Note(100, "USD"), "GBP");

        assertEquals(new Note((int) (100 / 2 * (1 - 0.015)), "GBP"), result);
    }

    @Test
    public void testRate() {
        try {
            assertEquals("테스트", "테스트");
            fail();
        } catch (IllegalArgumentException e) {

        }
    }

    @Test
    public void voidOptionalTest() {
        System.out.println("test");
        assertEquals("test", "test");
    }


    @Test
    public void testComposite() {
        Account account = new Account();
        Account subAccount = new Account();
        Bank bank = new Bank();

        account.addTransaction(new Transaction(Money.dollar(5)));
        account.addTransaction(new Transaction(Money.dollar(7)));
        account.addTransaction(new Transaction(Money.dollar(8)));

        subAccount.addTransaction(new Transaction(Money.dollar(15)));
        subAccount.addTransaction(new Transaction(Money.dollar(5)));

        account.addTransaction(subAccount);

        Money result = bank.reduce(account.balance(), "USD");

        assertEquals(result, Money.dollar(40));
    }
}