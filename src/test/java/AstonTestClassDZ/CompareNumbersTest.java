package AstonTestClassDZ;

import AstonTestDZ.CompareNumbers;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CompareNumbersTest {

    @Test
    public void test1() {
        Assert.assertEquals("5 больше 3", CompareNumbers.compare(5, 3));
    }

    @Test
    public void test2() {
        Assert.assertEquals("3 меньше 5", CompareNumbers.compare(3, 5));
    }

    @Test
    public void test3() {
        Assert.assertEquals("числа равны", CompareNumbers.compare(10, 10));
    }

    @Test
    public void test4() {
        Assert.assertEquals("-5 меньше 3", CompareNumbers.compare(-5, 3));
    }

    @Test
    public void test5() {
        Assert.assertEquals("5 больше -3", CompareNumbers.compare(5, -3));
    }

    @Test
    public void test6() {
        Assert.assertEquals("-5 больше -10", CompareNumbers.compare(-5, -10));
    }

    @Test
    public void test7() {
        Assert.assertEquals("-10 меньше -5", CompareNumbers.compare(-10, -5));
    }

    @Test
    public void test8() {
        Assert.assertEquals("числа равны", CompareNumbers.compare(-7, -7));
    }

    @Test
    public void test9() {
        Assert.assertEquals("0 меньше 5", CompareNumbers.compare(0, 5));
    }

    @Test
    public void test10() {
        Assert.assertEquals("5 больше 0", CompareNumbers.compare(5, 0));
    }

    @Test
    public void test11() {
        Assert.assertEquals("числа равны", CompareNumbers.compare(0, 0));
    }
}
