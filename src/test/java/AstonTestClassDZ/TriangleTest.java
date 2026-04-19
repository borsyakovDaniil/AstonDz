package AstonTestClassDZ;

import AstonTestDZ.Triangle;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TriangleTest {
    @Test
    public void test1() {
        Assert.assertEquals(25.0, Triangle.area(10, 5));
    }

    @Test
    public void test2() {
        Assert.assertEquals(12.0, Triangle.area(6, 4));
    }

    @Test
    public void test3() {
        Assert.assertEquals(12.0, Triangle.area(3, 8));
    }

    @Test
    public void test4() {
        Assert.assertEquals(10.5, Triangle.area(7, 3));
    }

    @Test
    public void test5() {
        Assert.assertEquals(40.5, Triangle.area(9, 9));
    }

    @Test
    public void test6() {
        Assert.assertEquals(5.5, Triangle.area(5.5, 2));
    }

    @Test
    public void test7() {
        Assert.assertEquals(5.0, Triangle.area(2.5, 4));
    }

    @Test
    public void test8() {
        Assert.assertEquals(0.125, Triangle.area(0.5, 0.5));
    }

    @Test
    public void test9() {
        Assert.assertEquals(0.5, Triangle.area(1, 1));
    }

    @Test
    public void test10() {
        Assert.assertEquals(1.0, Triangle.area(1, 2));
    }

    @Test
    public void test11() {
        Assert.assertEquals(0.0, Triangle.area(0, 5));
    }

    @Test
    public void test12() {
        Assert.assertEquals(0.0, Triangle.area(5, 0));
    }

    @Test
    public void test13() {
        Assert.assertEquals(0.0, Triangle.area(0, 0));
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void test14() {
        Triangle.area(-5, 10);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void test15() {
        Triangle.area(5, -10);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void test16() {
        Triangle.area(-3, -3);
    }
}
