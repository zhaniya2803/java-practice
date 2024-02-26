//package Yrok_12_02_2024;
//
//import java.util.Scanner;
//
//public class PasswordValidator {
//    public static void main(String[] args) {
//        // пароль должен быть минимум 8 символов
//        // пароль должен содержать минимум 1 цифру
//        // пароль должен содержать минимум 1 заглавную букву
//
//        System.out.println("Введите пароль");
//        String password = new Scanner(System.in).nextLine();
//
//        if (checkPassword(password)) {
//            System.out.println("Пароль подходит");
//        } else throw new RuntimeException(System.out.println("Пароль не подходит"));
//    }
//
//    static boolean checkPassword(String password) {
//        if (password.length() < 8) {
//            System.out.println("В пароле меньше восьми символов ");
//            return false;
//        }
//
//        boolean hasDigit = false;
//        boolean hasUpperCase = false;
//
//        for (char symbol : password.toCharArray()) {
//            if (Character.isDigit(symbol)) {
//                System.out.println("В пароле нету цифр");
//                hasDigit = true;
//            }
//
//            if (Character.isUpperCase(symbol)) {
//                System.out.println("В пароле нету верхнего регистра");
//                hasUpperCase = true;
//            }
//
//            if (hasDigit && hasUpperCase) {
//                return true;
//            }
//        }
//        return false;
//    }
//
//
//
//}
