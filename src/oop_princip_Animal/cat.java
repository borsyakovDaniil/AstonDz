package oop_princip_Animal;


public class cat extends animal {
    public static int count = 0;
    private boolean isFull;
    private int appetite;

    public cat(String name, int appetite) {
        super(name);
        this.isFull = false;
        this.appetite = appetite;
        this.runLimit = 200;
        this.swimLimit = 0;
        count++;
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " - не умеет плавать");
    }

    public void eat(bowl bowl) {
        if (bowl.takeFood(appetite)) {
            this.isFull = true;
            System.out.println(name + " - поел и теперь сыт");
        } else {
            System.out.println(name + " - остался голодным не хватило еды");
        }
    }

    public void status() {
        System.out.println(name + " - сытость :" + isFull);
    }
}