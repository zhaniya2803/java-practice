package Yrok_20_11_2023;

import java.util.Arrays;

public class task_3 {
    public static void main(String[] args) {
        String[] array1 = {"Яблоко", "Банан", "Апельсин"};
        String[] array2 = {"Томат", "Огурец", "Перец"};
        String[] array3 = {array1[0], array1[1],array1[2], array2[0], array1[1], array2[2]};
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println();
        System.out.println(Arrays.toString(array3));
    }
}
