import java.util.Scanner;
public class test_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scanner.nextInt();
        int couner = 0;
        for (int i = 2; i <= number ; i++) {
            if (number % i == 0) {
                couner += 1;
                break;
            }
        }
        if (couner == 0) {
            System.out.println(number + " - простое число");
        }else {
            System.out.println(number + " -  не простое число");
        }
        }
    }

