package classess1;

public class BankAccountt {
    private double balance;

    BankAccountt(double balance){
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double depositMoney){
        balance = balance+depositMoney;
    }

    public void withdraw(double withdrawMoney){
        balance = balance-withdrawMoney;
    }
}
