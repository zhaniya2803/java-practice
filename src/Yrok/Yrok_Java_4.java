package Yrok;

import java.util.Scanner;

public class Yrok_Java_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите ваше имя:");
//        String name = scanner.next();
//        System.out.println("Hello " + name);

//        System.out.println("Введите температуру воздуха: ");
//        int a = scanner.nextInt();
//        System.out.println("Температура воздуха " + a + "C");

//        System.out.println("Введите первое число: ");
//        int a = scanner.nextInt();
//        System.out.println("Введите второе число: ");
//        int b = scanner.nextInt();
//        System.out.println("Введите третье число: ");
//        int c = scanner.nextInt();
//        int avg = (a+b+c)/3;
//        System.out.println("Среднее значение: " + avg);

//        System.out.println("Введите столицу Австралии: ");
//        String city = scanner.next();
//        System.out.println("Ваш ответ: " + city);
//        System.out.println("Правильный ответ: Канберра");

//        System.out.println("Введите первое число: ");
//        int a = scanner.nextInt();
//        System.out.println("Введите второе число: ");
//        int b = scanner.nextInt();
//        System.out.println("Введите оператор (+, -, *, /): ");
//        String operator = scanner.next();
//        if (operator.equals("+")) {
//            System.out.println(a + b);
//        } else if (operator.equals("-")) {
//            System.out.println(a - b);
//        } else if (operator.equals("*")) {
//            System.out.println(a * b);
//        } else if (operator.equals("/")) {
//            System.out.println(a/b);
//        }else {
//            System.out.println("Оператор не верен");
//        }

//        int total = 0;
//        for (int i = 1; i <= 5 ; i++) {
//            System.out.print("Введите число: ");
//            int number = scanner.nextInt();
//            total += number;
//        }
//        System.out.println("Сумма введенных чисел: " + total);

//        System.out.print("Введите число: ");
//        int number = scanner.nextInt();
//        for (int i = 1; i <= 10 ; i++) {
//            System.out.printf("%d * %d = %d\n", number, i, number* i);
//        }
//        System.out.print("Введите число: ");
//        int number = scanner.nextInt();
//        for (int i = 1; i <= 10 ; i++) {
//            System.out.println(number + " * " + i + " = " + number*i);;
//        }

//        System.out.println("Введите три целых числа: ");
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        int c = scanner.nextInt();
//        int min;
//        if(a <= b && b <= a){
//            min = a;
//        } else if (b <= c && b <= a ) {
//            min = b;
//        }else {
//            min = c;
//        }
//        System.out.println("Наименьшее чило: " + min);


//        System.out.print("Введите число: ");
//        int number = scanner.nextInt();
//        int factorial = 1;
//        for (int i = 1; i <= number ; i++) {
//            factorial *= i;
//        }
//        System.out.println(factorial);


        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        boolean isPrime = true;
        for (int i = 2; i < number ; i++) {
            if (number % i ==0) {
                isPrime = false;
            }
        }
        if (isPrime) {
            System.out.println(number + " - простое число");
        } else {
            System.out.println(number + " - не является простым числом");
        }






    }
}
