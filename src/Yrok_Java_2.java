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
}
