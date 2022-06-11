import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DollarTest {
    @Test
    public void testDifferentClassEquality() {
        assertTrue(new Money(10, "CHF").equals(new Franc(10, "CHF")));
    }
}