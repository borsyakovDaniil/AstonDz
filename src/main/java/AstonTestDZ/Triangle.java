package AstonTestDZ;

public class Triangle {
    public static double area(double a, double h) {
        if (a < 0 || h < 0) {
            throw new IllegalArgumentException("Стороны должны быть положительные");
        }

        return (a * h) / 2;
    }
}

