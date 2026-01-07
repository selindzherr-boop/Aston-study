package org.example;

public class Product {

    String name;
    String prodDate;
    String manufacture;
    String country;
    double price;
    boolean isReservnStatus;

    public Product(String name, String prodDate, String manufacture, String country, double price, boolean reservnStatus) {
        this.name = name;
        this.prodDate = prodDate;
        this.manufacture = manufacture;
        this.country = country;
        this.price = price;
        this.isReservnStatus = reservnStatus;
    }

    public void printInfo() {
        System.out.println("Название товара: " + name);
        System.out.println("Дата производства: " + prodDate);
        System.out.println("Производитель: " + manufacture);
        System.out.println("Страна происхождения: " + country);
        System.out.println("Цена: " + price + " USD");

        if (isReservnStatus) {
            System.out.println("Состояние бронирования покупателем: забронирован");
        } else {
            System.out.println("Состояние бронирования покупателем: доступен к покупке");
        }
        System.out.println();
    }
}
