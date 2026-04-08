package geomatry;

class rectangle implements Shape {
    private double a, b;
    private String fill, border;

    public rectangle(double a, double b, String fill, String border) {
        this.a = a;
        this.b = b;
        this.fill = fill;
        this.border = border;
    }

    @Override
    public double getArea() {
        return a * b;
    }

    @Override
    public double getPerimeter() {
        return 2 * (a + b);
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
