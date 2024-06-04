package hw;

public class CurrentAccount extends Account{
    public CurrentAccount(int a) {
        super(a);
    }

    public void withdraw(double sum){
        int overDraftLimit = -50;
        if((getBalance()-sum) <= overDraftLimit){
            System.out.println("Your current balance is "+ getBalance());
        }else{
            System.out.println("You have exceeded overdraft limit");
        }

    }

    public String toString()
    {
        return "Acc " + getAccountNumber() + ": " + "balance = " + getBalance();
    }
}