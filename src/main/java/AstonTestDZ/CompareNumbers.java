package AstonTestDZ;

public class CompareNumbers {
    public static String compare(int a, int b) {
        if (a > b) {
            return a + " больше " + b;
        } else if (a < b) {
            return a + " меньше " + b;
        } else {
            return "числа равны";
        }
    }
}
