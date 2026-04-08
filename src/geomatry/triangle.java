package geomatry;

class triangle implements Shape {
    private double a, b, c;
    private String fill, border;

    public triangle(double a, double b, double c, String fill, String border) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.fill = fill;
        this.border = border;
    }

    @Override
    public double getArea() {
        return (a * b) / 2;
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }

    @Override
    public String getFillColor() {
        return fill;
    }

    @Override
    public String getBorderColor() {
        return border;
    }
}
