package Yrok_20_11_2023;

import java.util.Arrays;
import java.util.Scanner;

public class task_4 {
    public static void main(String[] args) {
        String[] words = new String[5];
        words[0] = "test";
        words[1] = "apple";
        words[2] = "orange";
        words[3] = "table";
        words[4] = "chair";

        System.out.println(Arrays.toString(words));
        System.out.println("Введите сторку массива: ");
        Scanner scanner = new Scanner(System.in);
        String newElement = scanner.next();
        words [0] = newElement;
        words [1] = newElement;
        words [2] = newElement;
        words [3] = newElement;
        words [4] = newElement;

        System.out.println(Arrays.toString(words));

    }
}
