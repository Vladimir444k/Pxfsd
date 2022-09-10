package ru.netology.sqr;

public class App {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            if ( i * i > 10 && i * i < 99) {
                System.out.println("Квадрат числа " + i);
            }
        }
        System.out.println("Вышли из цикла");
    }
}
