package Yrok;

import java.util.Scanner;

public class Yrok_Java_2 {
    public static void main(String[] args) {
        double purchase = 10000;
        double skidka = purchase - (purchase * 0.1);
        if (purchase > 10000) {
            System.out.println("Сумма с учетом 10% скидки составляет: " + (int) skidka);
        } else if (purchase < 10000){
            System.out.println("Скидка не доступна");
        }else{
            System.out.println("10000 включительно или нет?");
        }
//
//       int a = 12;
//       int b = 4;
//       String sign = "/";
//       if (sign == "+"){
//           int result = a + b;
//           System.out.println(result);
//       }else if (sign == "-"){
//           int result = a - b;
//           System.out.println(result);
//       }else if (sign == "*"){
//           int result = a * b;
//           System.out.println(result);
//       }else if (sign == "/"){
//           int result = a / b;
//           System.out.println(result);
//       }
    }

    public static class Yrok_Java_5 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    //        int days = 3;
    //        int run = 5;
    //        for (int i = 1; i <= days ; i++) {
    //            System.out.println("День" + i);
    //            for (int j = 1; j <= run ; j++) {
    //                System.out.println("Пробежка" + j);
    //            }
    //        }

    //        int days = 30;
    //        int seria = 3;
    //        for (int i = 1; i <=days  ; i++) {
    //            System.out.println("\nДень" + i + " ");
    //            for (int j = 1; j <= seria ; j++) {
    //                System.out.print("Серия" + j + " ");
    //            }
    //        }
    //        System.out.println("\nУра! ВЫ прокачали и Java, и английский!");

    //        int flatsNumber = 5;
    //        int floorsNumber = 10;
    //        for (int i = 1; i <= floorsNumber ; i++) {
    //            for (int j = 1; j <= flatsNumber ; j++) {
    //                int currentFlat = (i - 1) * flatsNumber + j;
    //                System.out.println("Этаж " + i + " квартира " + currentFlat + " - доставлено.");
    //            }
    //            System.out.println();
    //        }

    //        System.out.println("Введите кол-во фильмов: ");
    //        int number = scanner.nextInt();
    //        double sum = 0;
    //        for (int i = 1; i <= number ; i++) {
    //            System.out.println("Введите продолжительность фильма в минутах: ");
    //            double timeMin = scanner.nextInt();
    //            sum += timeMin;
    //        }
    //        System.out.println("Общая продолжительность всех фильмов в часах:" + (sum/60) );

            System.out.println("Введите кол-во ступенек: ");
            int a = scanner.nextInt();
            String b = "#";
            String c = "1";
            for (int i = 1; i <= a; i++) {
                for (int j = a-1; j > 1 ; j--) {
                    System.out.print(c);
                }
                System.out.println(c + b);
                b += "#";
            }

    //        System.out.println("Введите общий выделенный бюджет: ");
    //        int sum = scanner.nextInt();
    //        System.out.println("Введите количество проектов: ");
    //        int project = scanner.nextInt();
    //        for (int i = 1; i <= project ; i++){
    //            System.out.println("\nВведите стоимость бюджета проекта " + i + ": ");
    //            int maney = scanner.nextInt();
    //            int octatok = sum - maney;
    //            if (octatok < 0) {
    //                System.out.println("Бюджет закончилсяб проект " + i + " не получил финансирование");
    //            } else {
    //                System.out.println("Проект " + i + " получил бюджет в размере " + maney);
    //                System.out.println("Бюджет: " + (sum-=maney));
    //            }
    //        }


    //        System.out.println("Введите общий выделенный бюджет: ");
    //    int sum = scanner.nextInt();
    //    System.out.println("Введите количество проектов: ");
    //    int project = scanner.nextInt();
    //    for(int i = 1; i <= project; i++) {
    //        System.out.println("Введите стоимость бюджета прокта" + i + ":");
    //        int money = scanner.nextInt();
    //        System.out.println("Проект " + i + " получил бюджет в размере " + money);
    //        sum -= money;
    //        System.out.println("Бюджет:" + sum);
    //        if(sum < money){
    //            System.out.println("Бюджет закончился");
    //            return;
    //        }
    //    }



        }
    }
}
