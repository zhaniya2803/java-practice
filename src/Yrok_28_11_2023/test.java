package Yrok_28_11_2023;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
    int [] array1 = {3, 7, 4, 8, 5, 15, 4};
    int [] array2 = {4, 5, 6, 7};
        System.out.println(Arrays.toString(concatenateArrays(array1, array2)));

    }
    static boolean contains(int[] numbers, int element) {
        for (int number : numbers) {
            if (number == element) {
                System.out.println("yes");
                return true;
            } else return false;
        }
        return true;
    }

    static int[] concatenateArrays(int[] array1, int[] array2) {
        int [] array3 = new int[array1.length + array2.length];
        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
            for (int k = 0; k < array2.length; k++) {
                array3 [i++] = array2.length;
                return array3;
            }
        }
//        System.out.println(Arrays.toString(array3));
        return array3;
    }



}
