package TDD;

import TDD.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DollarTest {
    @Test
    public void testCurrencyExchange() {
        Bank bank = new Bank();
        bank.addRate("USD", "GBP", 2);
        bank.commission(0.015);
        Money result = bank.convert(new Note(100, "USD"), "GBP");

        assertEquals(new Note((int) (100 / 2 * (1 - 0.015)), "GBP"), result);
    }
}