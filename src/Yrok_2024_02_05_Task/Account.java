package Yrok_2024_02_05_Task;

public abstract class Account {

    Account account;
    int amount;

    public Account(Account account, int amount) {
        this.account = account;
        this.amount = amount;
    }

    public Account getAccount() {
        return account;
    }



    public int getAmount() {
        return amount;
    }


    public abstract void pay (int amount);
    public abstract void transfer(Account account, int amount);
    public abstract void addMoney(int amount);
}
