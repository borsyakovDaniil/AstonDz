package oop_princip_Animal;

public class dog extends animal {

    public static int count = 0;

    public dog(String name) {
        super(name);
        this.runLimit = 500;
        this.swimLimit = 10;
        count++;
    }

}
