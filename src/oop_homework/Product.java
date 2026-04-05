package oop_homework;


public class Product {
    private String name;
    private String productionDate;
    private String manufacturer;
    private String countryOfOrigin;
    private int price;
    private String statusOfTheBookingByTheBuyer;


    public Product(String name, String productionDate, String manufacturer, String countryOfOrigin, int price, String statusOfTheBookingByTheBuyer) {
        this.name = name;
        this.productionDate = productionDate;
        this.manufacturer = manufacturer;
        this.countryOfOrigin = countryOfOrigin;
        this.price = price;
        this.statusOfTheBookingByTheBuyer = statusOfTheBookingByTheBuyer;
    }

    public void printInfo() {
        System.out.println("информация о товаре");
        System.out.println("Название:" + name);
        System.out.println("дата производства:" + productionDate);
        System.out.println("производитель:" + manufacturer);
        System.out.println("страна происхождения:" + countryOfOrigin);
        System.out.println("цена:" + price);
        System.out.println("состояние бронирования покупателем:" + statusOfTheBookingByTheBuyer);
    }

    public static void main(String[] args) {
        Product product1 = new Product("Футболка", "20.01.2026", "Puma", "Китай", 3000, "оплачен");

        Product[] productsArray = new Product[5];

        productsArray[0] = new Product("Умная розетка Яндекс", "20.01.2026", "Яндекс", "Россия", 1683, "оплачен");
        productsArray[1] = new Product("Яндекс Станция Миди", "22.02.2026", "Яндекс", "Беларусь", 14390, "оплачен");
        productsArray[2] = new Product("Яндекс станция 3 ", "23.12.2025", "Яндекс", "Китай", 25135, "оплачен");
        productsArray[3] = new Product("Умный выключатель Яндекс", "24.03.2026", "Яндекс", "Россия", 2584, "оплачен");
        productsArray[4] = new Product("Умная лампочка Яндекс", "20.01.2026", "Яндекс", "Россия", 855, "оплачен");

        productsArray[0].printInfo();
    }

}