package org.example;

public class Main {
    public static void main(String[] args) {
        product();
        park();
    }

    public static void product() {
        Product[] productsArray = new Product[5];
        productsArray[0] = new Product("BMW F30", "12/12/2020", "Bayerische Motoren Werke AG", "Germany", 50600.3, true);
        productsArray[1] = new Product("Hyundai i30", "10/07/2017", "Hyundai Motor Company", "South Korea", 12400, false);
        productsArray[2] = new Product("Volkswagen Touran", "10/07/2007", "VAG", "Germany", 7800.8, true);
        productsArray[3] = new Product("Audi TT", "06/06/2013", "VAG", "Germany", 13600, false);
        productsArray[4] = new Product("Mitsubishi Outlander", "10/07/2010", "Mitsubishi Motors", "Japan", 8300.9, true);

        for (int i = 0; i < productsArray.length; i++) {
            productsArray[i].printInfo();
        }
    }

    public static void park() {
        Park park = new Park();

        Park.Carousels carousels1 = park.new Carousels("Ракушки",
                "10:00-19:00", 5);
        Park.Carousels carousels2 = park.new Carousels("Сюрприз",
                "10:00-21:00", 10);

        System.out.println("Аттракцион: " + carousels1.name);
        System.out.println("Время работы: " + carousels1.workTime);
        System.out.println("Цена: " + carousels1.price + " рублей");

        System.out.println("Аттракцион: " + carousels2.name);
        System.out.println("Время работы: " + carousels2.workTime);
        System.out.println("Цена: " + carousels2.price + " рублей");
    }
}
