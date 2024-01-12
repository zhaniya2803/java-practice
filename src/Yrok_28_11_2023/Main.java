package Yrok_28_11_2023;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] numbers = {3, 7, 4, 8, 5, 15, 4};
//        calculateAverage(numbers);
//        findMax(numbers);
//        reverseArray(numbers);
//        System.out.println(Arrays.toString(numbers));
        contains(numbers, 15);

    }

    //1 Подсчет среднего значения элементов массива:
    static double calculateAverage(int[] numbers) {
        int sumNumber = 0;
        int argNumbers = 0;
        for (int number : numbers) {
            sumNumber += number;
        }
        argNumbers = sumNumber/numbers.length;
        System.out.println(argNumbers);
        return 0;
    }


    //2 Поиск максимального элемента в массиве:
    static void findMax(int[] numbers) {
        int max = numbers[0];
        for (int number: numbers) {
            if (number > max) {
                max = number;
            }
        }
        System.out.print("Максимальный элемент массива: " + max);
    }

    //3 Переворот массива:
    static void reverseArray(int[] numbers) {
        int [] temp = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            temp[numbers.length - 1 - i] = numbers[i];
        }

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = temp[i];
        }
    }

    //4 Проверка наличия элемента в массиве:
    static boolean contains(int[] numbers, int element) {
        for (int number : numbers) {
            if (number == element) {
                System.out.println("yes");
                return true;
            } else return true;
        }
//        for (int i = 0; i < numbers.length; i++) {
//            if (element == numbers[i]) {
//                return true;
//            }else return false;
//        }
//        if (true) System.out.println("yes");

//        System.out.println("Элемент" + element + " есть в массиве");
        return true;
    }







}
