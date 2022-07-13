package TDD.AllTest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AllTest03 {
    @Test
    public void testCase03() {
        assertTrue(true);
    }

    @Test
    public void testCase04() {
        assertEquals("kimsunho","test", "선택적 매개변수");
    }
}
