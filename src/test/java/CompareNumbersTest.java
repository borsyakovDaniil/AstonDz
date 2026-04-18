
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CompareNumbersTest {

    @Test
    public void test1(){
        assertEquals("5 больше 3", CompareNumbers.compare(5,3));
    }
    @Test
    public void test2(){
        assertEquals("3 меньше 5", CompareNumbers.compare(3,5));
    }
    @Test
    public void test3(){
        assertEquals("числа равны",CompareNumbers.compare(10,10));
    }
    @Test
    public void test4(){
        assertEquals("-5 меньше 3",CompareNumbers.compare(-5,3));
    }
    @Test
    public void test5(){
        assertEquals("5 больше -3",CompareNumbers.compare(5,-3));
    }
    @Test
    public void test6(){
        assertEquals("-5 больше -10",CompareNumbers.compare(-5,-10));
    }
    @Test
    public void test7(){
        assertEquals("-5 больше -10",CompareNumbers.compare(-5,-10));
    }
    @Test
    public void test8(){
        assertEquals("-10 меньше -5",CompareNumbers.compare(-10,-5));
    }
    @Test
    public void test9(){
        assertEquals("числа равны",CompareNumbers.compare(-7,-7));
    }
    @Test
    public void test10(){
        assertEquals("0 меньше 5",CompareNumbers.compare(0,5));
    }
    @Test
    public void test11(){
        assertEquals("5 больше 0",CompareNumbers.compare(5,0));
    }
    @Test
    public void test12(){
        assertEquals("числа равны",CompareNumbers.compare(0,0));
    }
}
