package Methods;

public class Month {
    public void checkDaysINMouth (int number) {
        if (number == 2) {
            System.out.println("В этом месяцк 28 дней");
        } else if (number == 1 || number == 3 || number == 5 || number == 7 || number == 8 || number==10 || number == 12) {
            System.out.println("В этом месяцк 31 дней");
        }else if (number == 4 || number == 6 || number == 9 || number == 11 ) {
            System.out.println("В этом месяцк 30 дней");
        }
        else {
            System.out.println(" Такого месяце нет");
        }
    }
}
