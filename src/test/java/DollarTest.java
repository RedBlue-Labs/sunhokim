import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DollarTest {
    @Test
    public void testEquality(){
        Dollar five = new Dollar(5);
        int amount = five.times(2);
        assertEquals(10, amount);
        amount = five.times(3);
        assertEquals(15, amount);
    }
}