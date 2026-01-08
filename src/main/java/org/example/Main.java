package org.example;

public class Main {
    public static void main(String[] args) {
        Cat bakky = new Cat("Бакки");
        Cat lucky = new Cat("Лаки");
        Dog bobik = new Dog("Бобик");
        Dog simba = new Dog("Симба");
        bakky.run(150);
        lucky.run(360);
        bobik.run(350);
        simba.run(599);
        System.out.println("Котики:" + Cat.getCount());
        System.out.println("Собаки:" + Dog.getCount());
        System.out.println("Всего животных: " + Animal.getCount());
        System.out.println(bakky);
        System.out.println(simba);

        System.out.println(" Предлагаем всем котам покушать ");

        Feeding feeding = new Feeding(40);
        System.out.println("Начато кормление с " + feeding.getFoodAmount() + " грам еды ");
        Cat[] cats = {
                new Cat("Bulka", 12),
                new Cat("Pirozhok", 18),
                new Cat("Baton", 28) };

        System.out.println("Кушайте угощения ");
        for (Cat cat : cats) {
            cat.eat(feeding);
        }

        System.out.println("Добавляем еще еды: ");
        feeding.addFood(10);

        System.out.println("Кушайте ещё угощения ");
        for (Cat cat : cats) {
            if (!cat.isSatiety()) {
                cat.eat(feeding);
            }
        }
        System.out.println(" Информация о сытости котов ");
        System.out.println("Осталось еды: " + feeding.getFoodAmount());
        for (Cat cat : cats) {
            System.out.println(cat.getName() + " - " +
                    (cat.isSatiety() ? "СЫТ" : "ГОЛОДЕН"));

        }
    }
}