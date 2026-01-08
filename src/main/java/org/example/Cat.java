package org.example;

public class Cat extends Animal {
    private static int count;
    private int runCatLimit = 200;
    private int swimCatLimit = 0;
    private String className = "кошки";
    private boolean isSatiety = false;
    private int appetite;

    public Cat(String name) {
        super(name);
        this.appetite = 10; // Значение по умолчанию
        setCount(count);
    }

    public Cat(String name, int appetite) {
        super(name);
        this.appetite = appetite;
        setCount(count);
    }

    public int getRunCatLimit() {
        return runCatLimit;
    }

    public int getSwimCatLimit() {
        return swimCatLimit;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        count++;
        Cat.count = count;
        Animal.setCount(count);
    }

    @Override
    public String getClassName() {
        return className;
    }

    @Override
    public void run(int x) {
        if(x <= getRunCatLimit()) {
            super.run(x);
        } else {
            System.out.println("Коты столько не бегают, тем более " + getName() + ".");
        }
    }

    @Override
    public void swim(int x) {
        if(x != getSwimCatLimit()) {
            System.out.println("Кот не умеет плавать, а " + getName() + " и подавно.");
        }
    }

    public void eat(Feeding feeding) {
        if (!isSatiety) {
            if (feeding.decreaseFood(appetite)) {
                isSatiety = true;
                System.out.println(getName() + " покушал " + appetite + " еды и теперь сыт.");
            } else {
                System.out.println(getName() + " хотел сьесть " + appetite +
                        ", но доступно только " + feeding.getFoodAmount() + " еды. Остался голодным.");
            }
        } else {
            System.out.println(getName() + " уже сыт и не хочет есть.");
        }
    }

    public boolean isSatiety() {
        return isSatiety;
    }
}