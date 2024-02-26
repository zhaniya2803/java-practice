package Yrok_2024_02_12;

public class Test {
    public static void main(String[] args) {
        try{
            int a = 5;
            int b = 0;
            System.out.println(a/b);
        }catch (ArithmeticException exception){
            System.out.println(exception.getMessage());
        }

        System.out.println("Код после деления ");



    }
}
