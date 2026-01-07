package org.example;

public class Lesson_1 {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();

        boolean result1 = sumReference(8, 6);
        System.out.println(result1);
        // Проверка для себя
        // boolean result2 = sumReference(12,13);
        // System.out.println(result2);

        printNumber(-9);

        boolean result3 = integrNumber(0);
        System.out.println(result3);

        printStringFewTimes("Help", 6);

        boolean result4 = leapYear(2000);
        System.out.println(result4);

        int[] arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        invertArr(arr1);

        int[] arr = new int[100];
        emptyArr(arr);

        int[] arr2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        multiplicationArr(arr2);


    }

    //1. Создайте метод printThreeWords()
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    //2. Создайте метод checkSumSign()
    public static void checkSumSign() {
        int a = -20;
        int b = 10;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    //3. Создайте метод printColor()
    public static void printColor() {
        int value = 106;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    //4. Создайте метод compareNumbers()
    public static void compareNumbers() {
        int a = 10;
        int b = 15;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    //5.
    public static boolean sumReference(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }

    //6.
    public static void printNumber(int number) {
        if (number > 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    //7.
    public static boolean integrNumber(int number) {
        if (number < 0) {
            return true;
        } else {
            return false;
        }
    }

    //8.
    public static void printStringFewTimes(String text, int count) {
        for (int a = 0; a < count; a++) {
            System.out.print(text);
        }
    }

    //9.
    public static boolean leapYear(int number) {
        if (number % 4 == 0 && number % 100 != 0 || number % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }

    //10.
    public static void invertArr(int[] arr1) {
        for (int a = 0; a < arr1.length; a++) {
            if (arr1[a] == 0) {
                arr1[a] = 1;
            } else if (arr1[a] == 1) {
                arr1[a] = 0;
            }
        }
        System.out.print("Инвертированный массив: ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
    }

    //11.
    public static void emptyArr(int[] arr) {
        for (int b = 0; b < arr.length; b++) {
            arr[b] = b + 1;
        }
        for (int b = 0; b < arr.length; b++) {
            System.out.print(arr[b]);
            if (b < arr.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }

    //12.
    public static void multiplicationArr(int[] arr2) {
        for (int c = 0; c < arr2.length; c++) {
            if (arr2[c] < 6) {
                arr2[c] = arr2[c] * 2;
            }
        }
        System.out.print("Перемноженный массив: ");
        for (int c = 0; c < arr2.length; c++) {
            System.out.print(arr2[c] + " ");
        }
    }
}
