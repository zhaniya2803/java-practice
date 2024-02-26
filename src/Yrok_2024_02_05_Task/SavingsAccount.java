package Yrok_2024_02_05_Task;

public class SavingsAccount extends Account{


    public SavingsAccount(Account account, int amount) {
        super(account, amount);
    }

    @Override
    public void pay(int amount) {
        System.out.println("Со сберегательного счета нельзя оплачивать!!");
    }

    @Override
    public void transfer(Account account, int amount) {
        if (amount >= 0) {
            System.out.println("Со бререгательного счета на " + account + " счет переведенна сумма: " + amount);
        } else {
            System.out.println("сберегательный не может уходить в минус.  YFJ<JHJN");
        };

    }

    @Override
    public void addMoney(int amount) {

    }
}
