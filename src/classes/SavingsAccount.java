package classes;

public class SavingsAccount extends Account {
    int withdrawLimit = 3;
    int count = 0;

    public SavingsAccount(int accountNumber, String name) {
        super(accountNumber, name);
    }

//    write a method here where we can not make more than withdraw limit
//    make a method like addInterest where you are going to add interest
//    public void addInterest(double interestAmmount) {
//        double balance2 = getBalance();
//        balance2 = balance2 + interestAmmount;
//        setBalance(balance2);
//    }

    public void addInterest(double interestPercentage) {
        double balance2 = getBalance();
        double intAmount = balance2 * (interestPercentage / 100);
        balance2 = balance2 + intAmount;
        setBalance(balance2);
    }

    public void withdrawMoney(double withdrawAmount){
        if(getBalance() >= withdrawAmount && count<withdrawLimit) {
            setBalance( getBalance() - withdrawAmount);
            count++;
            //balance -= withdrawAmount;
        }else {
            System.out.println("You can't withdraw "+withdrawAmount);
            System.out.println("Your balance is "+getBalance());
        }
    }
}