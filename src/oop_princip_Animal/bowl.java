package oop_princip_Animal;

public class bowl {

    private int food;

    //миска
    public bowl(int food) {
        this.food = food;
    }

    //добавить еду
    public void addFood(int amount) {
        if (amount > 0) {
            food += amount;
            System.out.println("в миску добавлена еда" + amount + "Теперь в миске: " + food);
        } else {
            System.out.println("Нельзя добавить отрицательное количество еды!");
        }
    }

    //поесть еду
    public boolean takeFood(int amount) {
        if (this.food >= amount) {
            this.food -= amount;
            System.out.println("В миске осталось: " + this.food);
            return true;
        } else {
            return false;
        }
    }

}
