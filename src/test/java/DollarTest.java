import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DollarTest {
    @Test
    public void testEquality(){
        assertTrue(new Dollar(5).equals(new Dollar(5)));
        assertFalse(new Dollar(5).equals(new Dollar(6)));
        assertFalse(new Dollar(5).equals(new Franc(5)));
    }

    @Test
    public void testDollarMultiplication() {
        Money five = Dollar.dollar(5);
        assertEquals(Dollar.dollar(10), five.times(2));
        assertEquals(Dollar.dollar(15), five.times(3));
    }

    @Test
    public void testFrancMultiplication() {
        Money five = Dollar.franc(5);
        assertEquals(Dollar.franc(10), five.times(2));
        assertEquals(Dollar.franc(15), five.times(3));
    }
}