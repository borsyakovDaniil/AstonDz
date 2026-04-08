package oop_princip_Animal;

public class animal {

    protected String name;
    public static int count = 0;
    protected int runLimit = 0;
    protected int swimLimit = 0;

    public animal(String name) {
        this.name = name;
        count++;
    }

    public void run(int distance) {
        if (distance <= runLimit) {
            System.out.println(name + " - пробежал" + distance + "м.");
        } else {
            System.out.println(name + " - не смог пробежать" + distance + "м.(максимум" + runLimit + "м.)");
        }
    }

    public void swim(int distance) {
        if (distance <= swimLimit) {
            System.out.println(name + " - проплыл" + distance + "м.");
        } else {
            System.out.println(name + " - не смог проплыть" + distance + "м.");
        }
    }
}