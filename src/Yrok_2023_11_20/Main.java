package Yrok_2023_11_20;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] colors = {"Красный", "Синий", "Зеленый", "Желтый", "Черный"};
        System.out.println("""
                0-Красный
                1-Синий
                2-Зеленый
                3-Желтый
                4-Черный """);
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите индекс цвета, который вы хотите поменять:");
        int firstNumber = scanner.nextInt();
        System.out.println("Введите индекс цвета, на который вы хотите поменять:");
        int secondNumber = scanner.nextInt();
        String swap = colors[firstNumber];
        colors[firstNumber] = colors[secondNumber];
        colors[secondNumber] = swap;
        System.out.println("Результат: ");
        System.out.println(colors[0]);
        System.out.println(colors[1]);
        System.out.println(colors[2]);
        System.out.println(colors[3]);
        System.out.println(colors[4]);


    }
}
