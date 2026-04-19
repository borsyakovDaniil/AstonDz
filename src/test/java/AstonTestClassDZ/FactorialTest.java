package AstonTestClassDZ;

import AstonTestDZ.Factorial;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FactorialTest {

    @Test
    public void test1() {
        Assert.assertEquals(Factorial.factorial(5), 120);
    }

    @Test
    public void test2() {
        Assert.assertEquals(Factorial.factorial(0), 1);
    }

    @Test
    public void test3() {
        Assert.assertEquals(Factorial.factorial(1), 1);
    }

    @Test
    public void test4() {
        Assert.assertEquals(Factorial.factorial(3), 6);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void test5() {
        Factorial.factorial(50);
    }
}
