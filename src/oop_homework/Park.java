package oop_homework;

public class Park {


    public class Attraction {
        private String attractionName;
        private String workingHours;
        private int price;

        public Attraction(String attractionName, String workingHours, int price) {
            this.attractionName = attractionName;
            this.workingHours = workingHours;
            this.price = price;
        }
        public void attractionPrintInfo () {
            System.out.println("Данные аттракциона");
            System.out.println("Название: " + attractionName);
            System.out.println("Время работы: " + workingHours);
            System.out.println("Стоимость: " + price + " руб.");
        }
    }

    public static void main(String[] args) {
        Park myPark = new Park();
        Park.Attraction attraction1 = myPark.new Attraction("Американские горки", "8:00 - 22:00", 500);
      attraction1.attractionPrintInfo();
        }
    }