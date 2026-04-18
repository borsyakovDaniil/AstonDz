import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    @Test
    public void test1() {
        assertEquals(5, Calculator.add(2, 3));
    }

    @Test
    public void rest2() {
        assertEquals(15, Calculator.add(10, 5));
    }

    @Test
    public void test() {
        assertEquals(1, Calculator.add(-2, 3));
    }

    @Test
    public void test3() {
        assertEquals(-10, Calculator.add(-5, -5));
    }

    @Test
    public void test4() {
        assertEquals(0, Calculator.add(0, 0));
    }

    @Test
    public void test5() {
        assertEquals(2, Calculator.subtract(5, 3));
    }

    @Test
    public void test6() {
        assertEquals(-2, Calculator.subtract(3, 5));
    }

    @Test
    public void test7() {
        assertEquals(-2, Calculator.subtract(-5, (-3)));
    }

    @Test
    public void test8() {
        assertEquals(0, Calculator.subtract(0, 0));
    }
    @Test
    public void test9(){
        assertEquals(-5,Calculator.subtract(0,5));
    }
    @Test
    public void test10(){
        assertEquals(6, Calculator.multiplay(2,3));
    }
    @Test
    public void test11(){
        assertEquals(0,Calculator.multiplay(5,0));
    }
    @Test
    public void test12(){
        assertEquals(-6,Calculator.multiplay(-2,3));
    }
    @Test
    public void test13(){
        assertEquals(6,Calculator.multiplay(-2,-3));
    }
    @Test
    public void test14(){
        assertEquals(6,Calculator.multiplay(-2,-3));
    }
    @Test
    public void test15(){
        assertEquals(100,Calculator.multiplay(1,100));
    }
    @Test
    public void test16(){
        assertEquals(0,Calculator.multiplay(0,999));
    }
    @Test
    public void divide(){
        assertEquals(2,Calculator.divide(6,3));
    }
    @Test
    public void test17(){
        assertEquals(5,Calculator.divide(10,2));
    }
    @Test
    public void test18(){
        assertEquals(2.5,Calculator.divide(5,2));
    }
    @Test
    public void test19(){
        assertEquals(0.5,Calculator.divide(1,2));
    }
    @Test
    public void test20(){
        assertEquals(0,Calculator.divide(0,5));
    }
    @Test
    public void test21(){
        assertEquals(5,Calculator.divide(10,2));
    }
    @Test
    public void test22(){
        assertThrows(ArithmeticException.class, () -> Calculator.divide(5,0));
    }
}