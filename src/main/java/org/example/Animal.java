package org.example;

public class Animal {
    private String name;
    private String className = "животное";
    private static int count;

    public Animal(String name) {
        this.name = name;
    }

    public void run(int x) {
        System.out.println(getName() + " пробежал " + x + " м.");
    }

    public String getClassName() {
        return className;
    }

    public void swim(int x) {
        System.out.println(getName() + " проплыл " + x + " м.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Animal.count = Cat.getCount() + Dog.getCount();
    }

    @Override
    public String toString() {
        return "Вид животного: " + getClassName() +
                ", кличка - '" + name + '\'';
    }
}