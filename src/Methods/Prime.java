package Methods;

public class Prime {
    public void isPrimeNumber (int number) {
        int couner = 0;
        for (int i = 2; i <= number/2 ; i++) {
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
