package oop_princip_Animal;

public class Main {
    public static void main(String[] args) {
        bowl bowl = new bowl(100);
        cat[] cats = {
                new cat("барсик", 40), new cat("bob", 20), new cat("tom", 50)
        };
        for (cat cat : cats) {
            cat.eat(bowl);
        }
        for (cat cat : cats) {
            cat.status();
        }

        for (cat cat : cats) {
            cat.swim(10);
        }
        for (cat cat : cats) {
            cat.run(201);
        }
        for (cat cat : cats) {

        }

        dog dog = new dog("bobik");
        dog.run(501);
        dog.swim(11);
        dog.run(250);
        dog.swim(5);

        System.out.println(animal.count);

        System.out.println(cat.count);

        System.out.println(dog.count);
    }

}
