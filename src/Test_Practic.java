import java.math.BigDecimal;
import java.util.Arrays;

public class Test_Practic {
    public static void main(String[] args) {
//        float wallet = 0.0f;
//        float productPrice = 0.01f;
//        for (int i = 1; i <= 100; i++) {
//            wallet += productPrice;
//        }
//        System.out.println(wallet);
//
//
//        BigDecimal wallet1 = new BigDecimal("0.0");
//        BigDecimal productPrice1 = new BigDecimal("0.01");
//        for (int i = 1; i <= 100; i++) {
//            wallet1 = wallet1.add(productPrice1);
//        }
//        System.out.println(wallet1);

//        Double a = 1.5;
//        Double b = 1.50;
//        System.out.println(a.equals(b));
////        BigDecimal x = new BigDecimal("1.5");
////        BigDecimal y = new BigDecimal("1.50");
////        System.out.println(x.equals(y));
//
//        BigDecimal x = new BigDecimal("1.5");
//        BigDecimal y = new BigDecimal("1.50");
//        System.out.println(x.compareTo(y));

//        BigDecimal b1 = new BigDecimal("67891");
//        BigDecimal b2 = new BigDecimal("12346");
//        if (b1.compareTo(b2) == 0) {
//            System.out.println(b1 + " и " + b2 + " равны ");
//        } else if (b1.compareTo(b2) > 0) {
//            System.out.println(b1 + " больше чем " + b2);
//        } else {
//            System.out.println(b1 + " меньше чем " + b2);
//        }

//        System.out.println(Math.pow(1, 2)); // 1.0
//        System.out.println(Math.pow(2, 2)); // 4.0
//        System.out.println(Math.pow(3, 2)); // 9.0
//        System.out.println(Math.pow(4, 2)); // 16.0
//        System.out.println(Math.pow(5, 2));

//        String[] fruits = {"яблоко", "груша", "апельсин", "банан", "киви" , "манго", "лимон"};
//        for (String fruit : fruits){
//            System.out.println(fruit.length() + " " + fruit);
//        }


        String months = "ЯНВАРЬ-ФЕВРАЛЬ-МАРТ-АПРЕЛЬ-МАЙ-ИЮНЬ-ИЮЛЬ-АВГУСТ-СЕНТЯБРЬ-ОКТЯБРЬ-НОЯБРЬ-ДЕКАБРЬ";
        String [] months_list = months.split("-");
        System.out.println(Arrays.toString(months_list));
        for (String s: months_list) {
            System.out.println();
            }
    }
    static String capitalize(String word) {
        return word.substring(0, 1).toLowerCase() + word.substring(1).toLowerCase();
    }

}

