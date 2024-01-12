package Homework;

public class test {
    public static void main(String[] args) {

       String model = "Эконом";
       String  region = "Ближний регион";
       int days = 5;
        Example example = new Example();

        double total = example.processRentalOrder(model, days, region);
        System.out.println(total);

    }

}
