package AstonTestClassDZ;

import AstonTestDZ.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {
    @Test
    public void test1() {
        Assert.assertEquals(5, Calculator.add(2, 3));
    }

    @Test
    public void test2() {
        Assert.assertEquals(15, Calculator.add(10, 5));
    }

    @Test
    public void test3() {
        Assert.assertEquals(1, Calculator.add(-2, 3));
    }

    @Test
    public void test4() {
        Assert.assertEquals(-10, Calculator.add(-5, -5));
    }

    @Test
    public void test5() {
        Assert.assertEquals(5, Calculator.add(0, 5));
    }

    @Test
    public void test6() {
        Assert.assertEquals(0, Calculator.add(0, 0));
    }

    @Test
    public void test7() {
        Assert.assertEquals(2, Calculator.subtract(5, 3));
    }

    @Test
    public void test8() {
        Assert.assertEquals(5, Calculator.subtract(10, 5));
    }

    @Test
    public void test9() {
        Assert.assertEquals(-2, Calculator.subtract(-5, (-3)));
    }

    @Test
    public void test10() {
        Assert.assertEquals(-5, Calculator.subtract(0, 5));
    }

    @Test
    public void test11() {
        Assert.assertEquals(0, Calculator.subtract(0, 0));
    }

    @Test
    public void test12() {
        Assert.assertEquals(6, Calculator.multiply(2, 3));
    }

    @Test
    public void test13() {
        Assert.assertEquals(0, Calculator.multiply(5, 0));
    }

    @Test
    public void test14() {
        Assert.assertEquals(-6, Calculator.multiply(-2, 3));
    }

    @Test
    public void test15() {
        Assert.assertEquals(6, Calculator.multiply(-2, -3));
    }

    @Test
    public void test16() {
        Assert.assertEquals(100, Calculator.multiply(1, 100));
    }

    @Test
    public void test17() {
        Assert.assertEquals(0, Calculator.multiply(0, 999));
    }

    @Test
    public void test18() {
        Assert.assertEquals(2.0, Calculator.divide(6, 3));
    }

    @Test
    public void test19() {
        Assert.assertEquals(5.0, Calculator.divide(10, 2));
    }

    @Test
    public void test20() {
        Assert.assertEquals(3.5, Calculator.divide(7, 2));
    }

    @Test
    public void test21() {
        Assert.assertEquals(2.5, Calculator.divide(5, 2));
    }

    @Test
    public void test22() {
        Assert.assertEquals(0.5, Calculator.divide(1, 2));
    }

    @Test
    public void test23() {
        Assert.assertEquals(0.0, Calculator.divide(0, 5));
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void test24() {
        Calculator.divide(5, 0);
    }
}
