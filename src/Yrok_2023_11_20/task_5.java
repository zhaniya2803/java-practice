package Yrok_2023_11_20;

import java.util.Arrays;

public class task_5 {
    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5};
        int [] reverseOrder = {original[4], original[3], original[2], original[1], original[0]};
        System.out.println(Arrays.toString(original));
        System.out.println(Arrays.toString(reverseOrder));
    }
}
