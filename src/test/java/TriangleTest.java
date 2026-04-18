import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TriangleTest {

    @Test
    public void test(){
assertEquals(25, Triangle.area(10,5));
    }
    @Test
    public void test1(){
        assertEquals(12.5, Triangle.area(5,5));
    }
    @Test
    public void test2(){
        assertEquals(5.5, Triangle.area(5.5,2));
    }
    @Test
    public void test3(){
        assertEquals(5, Triangle.area(2.5, 4));
    }
    @Test
    public void test4(){
        assertEquals(0.125, Triangle.area(0.5,0.5));
    }
    @Test
    public void test5(){
        assertEquals(1,Triangle.area(1,2));
    }
    @Test
    public void test6(){
        assertEquals(0,Triangle.area(0,5));
    }
    @Test
    public void test7(){
        assertEquals(0,Triangle.area(0,0));
    }
    @Test
    public void test8(){
        assertThrows(IllegalArgumentException.class, () -> Triangle.area(-5,10));
    }
    @Test
    public void test9(){
        assertThrows(IllegalArgumentException.class,()-> Triangle.area(-3,-3));
    }
}
