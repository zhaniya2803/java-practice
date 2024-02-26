package Yrok_2023_11_13;

public class Account {
    String ower;
    double balance;
    String history;



    void transfer(Account otherAccount, double money) {
        if (money <= balance) {
            otherAccount.balance += money;
            balance -= money;
            System.out.println("Со счёта " + ower + " перевели на счёт " + otherAccount.ower + " на сумму " + balance + " тг");
        } else {
            System.out.println("Недостаточно средств");
        }
    }

    void add (double money) {
        balance = balance + money;
        System.out.println("На счёт " + ower + " добавлено " + money + " тг");

    }

    void pay (Product product) {
        if (product.price <= balance) {
            balance = balance - product.price;
            System.out.println("Со счёт " + ower + " потрачено " + product.price + " тг");
        }else {
            System.out.println("Недостаточно средств");
        }
    }

    void display () {
        System.out.println("Владелец: " + ower);
        System.out.println("Текущий баланс: " + balance);
        System.out.println("");
    }
}
