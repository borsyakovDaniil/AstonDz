package AstonTestClassDZ;

import AstonTestDZ.Factorial;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FactorialTest {

    @Test
    public void testFactorial() {
        assertEquals(120, Factorial.factorial(5));

    }

    @Test
    public void testFactorial1() {
        assertThrows(IllegalArgumentException.class, () -> Factorial.factorial(-5));
    }

    @Test
    public void testFactorial2() {
        assertThrows(IllegalArgumentException.class, () -> Factorial.factorial(50));
    }
}
