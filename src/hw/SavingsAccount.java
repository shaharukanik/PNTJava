package hw;

public class SavingsAccount extends Account{
    public SavingsAccount(int a) {
        super(a);
    }

    public void interestCal(double interestPer){
        double sBalance = getBalance();
        double intAmonut = sBalance*(interestPer/100);
        sBalance = sBalance+intAmonut;
        sBalance = getBalance();
    }

    public String toString()
    {
        return "Acc " + getAccountNumber() + ": " + "balance = " + getBalance();
    }
}