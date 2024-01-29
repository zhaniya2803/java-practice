package Yrok;

import java.util.Random;
import java.util.Scanner;


public class Yrok_Java_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите начальный диапазон: ");
        int origin = scanner.nextInt();
        System.out.println("Введите начальный диапазон: ");
        int bound = scanner.nextInt();
        System.out.println("Сколько попыток хотите дать? ");
        int attempt = scanner.nextInt();
        System.out.println("Угадайте число от " + origin + " до " + bound + ": ");
        int generNumber = random.nextInt(origin, bound);
        while (true) {
            int input = scanner.nextInt();
            if (input == generNumber) {
                System.out.println("Вы угадали!");
                break;
            } else if (input > generNumber) {
                System.out.println("Заданное число МЕНЬШЕ (осталось попыток " + (attempt--) + " ) ");
            } else {
                System.out.println("Заданное число БОЛЬШЕ (осталось попыток " + (attempt--) + " ) ");
            }
        }
        System.out.println("Заданное число: " + generNumber);

//        int input = scanner.nextInt();
//        for (int i = origin; i <=attempt ; i++) {
//            if (input > generNumber){
//                System.out.println("Заданное число МЕНЬШЕ (осталось попыток " + (attempt-i) + " ) ");
//            } else if (input < generNumber) {
//                System.out.println("Заданное число БОЛЬШЕ (осталось попыток " + (attempt-i) + " ) ");
//            } else {
//                System.out.println("Вы угадали! ");
//                break;
//            }
//            input = scanner.nextInt();
//        }
//        System.out.println("Заданное число: " + generNumber);

    }
}
