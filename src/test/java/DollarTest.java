import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DollarTest {
    @Test
    public void testEquality(){
        assertTrue(new Dollar(5).equals(new Dollar(5))); // 무조건 통과하게 된다.
    }
}