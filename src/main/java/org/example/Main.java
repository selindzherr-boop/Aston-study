package org.example;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2.3, 3.4, "Белый", "Красный");
        Triangle triangle = new Triangle(4.5, 5.4, 8.2, "Синий", "Красный");
        Circle circle = new Circle(23.34, "Жёлтый", "Фиолетовый");
        //Выводим в консоль информацию о фигурах используя реализацию default метода в интерфейсе.
        System.out.println(rectangle);
        System.out.println(triangle);
        System.out.println(circle);
    }
}