package Homework;

import java.util.Scanner;

public class test_1 {
    public static void main(String[] args) {

        for (int i = 1; i < 75; i++) {
            if (i % 3 == 0) {
                System.out.println("Hello");
            } else if (i % 5 ==0) {
                System.out.println("Runtime");
            }  else System.out.println(i);
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Hello.Runtime");
            }
        }
    }
}
