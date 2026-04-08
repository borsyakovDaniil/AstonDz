package geomatry;

public class main {

    public static void main(String[] args) {

        Shape[] shapes = {new Circle(5, "red", "black"), new rectangle(5, 10, "blue", "white"), new triangle(3, 3, 4, "green", "yellow")};

        for (Shape s : shapes) {
            s.printInfo();
        }
    }
}
