package AstonTestDZ;

public class Factorial {

    public static int factorial;

    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Число должно быть >= 0");
        }
        if (n > 12) {
            throw new IllegalArgumentException("Слишком большое число");
        }

        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(factorial(5)); // 120
    }
}

