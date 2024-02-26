package Yrok_2023_11_20;

import java.util.Arrays;
import java.util.Scanner;

public class task_2 {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10};
        System.out.println(Arrays.toString(numbers));
        System.out.println("Введите число элемента (от 0 до 4), который вы хотите поменять: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println("Введите новое значение, элемта массива:");
        int newNumber = scanner.nextInt();
        numbers[num] = newNumber;
        System.out.println(Arrays.toString(numbers));
    }
}
