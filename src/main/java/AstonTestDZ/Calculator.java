package AstonTestDZ;

public class Calculator {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiplay(int a, int b) {
        return a * b;
    }

    public static double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Деление на ноль !");

        }
        return (double) a / b;
    }

    public static void main(String[] args) {
        System.out.println(add(5, 5));
        System.out.println(subtract(5, 2));
        System.out.println(multiplay(5, 5));
        System.out.println(divide(10, 2));
    }
}
