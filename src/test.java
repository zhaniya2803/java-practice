import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
////        int a = scanner.nextInt();
//        String b = "#";
//        String c = " ";
//        for (int i = 0; i < a; i++) {
//            for (int j = 0; j < a - i; j++) {
//
//                System.out.print(c);
//            }
//            for (int k = i; k >= 0; k--) {
//                System.out.print(b);
//            }
//            System.out.println( );
//        }


//        int a = scanner.nextInt();
//        String b = "#";
//        String c = " ";
//        for (int i = 0; i < a; i++) {
//            for (int k = 0; k < a - i; k++) {
//                System.out.print(c);
//            }
//            for (int j = i; j >= 0; j--) {
//                System.out.print(b);
//            }
//            System.out.print(c);
//
//            for (int j = i; j >= 0; j--) {
//                System.out.print(b);
//            }
//            for (int k = 0; k < a - i; k++) {
//                System.out.print(c);
//            }
//
//            System.out.println();
//        }


        int a = scanner.nextInt();
        String b = "#";
        String c = " ";
        for (int i = 0; i < a; i++) {
            for (int k = 0; k < a - i; k++) {
                System.out.print(c);
            }
            for (int j = i; j >= 0; j--) {
                System.out.print(b);
            }
            System.out.print(c);

            for (int j = i; j >= 0; j--) {
                System.out.print(b);
            }
            for (int k = 0; k < a - i; k++) {
                System.out.print(c);
            }
            System.out.print(c);
            for (int k = 0; k < a - i; k++) {
                System.out.print(c);
            }
            for (int j = i; j >= 0; j--) {
                System.out.print(b);
            }

            for (int j = i; j >= 0; j--) {
                System.out.print(b);
            }
            for (int k = 0; k < a - i; k++) {
                System.out.print(c);
            }
            System.out.println();
        }


//        int number = scanner.nextInt();
//            int couner = 0;
//            for (int i = 2; i <= number ; i++) {
//                if (number % i == 0) {
//                    couner += 1;
//                    break;
//                }
//            }
//            if (couner == 0) {
//                System.out.println(number + " - простое число");
//            }else {
//                System.out.println(number + " -  не простое число");
//            }
//        }
//
//
    }
}