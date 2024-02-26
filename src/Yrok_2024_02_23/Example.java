package Yrok_2024_02_23;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        System.out.println("Введите целое число => ");
        Scanner scanner = new Scanner(System.in);
        final  String inputValue = scanner.next();
        final int parsedValue = IntegerParser.parseInt(inputValue);
        System.out.println(parsedValue);
    }
}
