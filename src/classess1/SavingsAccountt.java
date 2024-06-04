package classess1;

public class SavingsAccountt extends BankAccountt {

    SavingsAccountt(double balance) {
        super(balance);
    }

    public void withdraw(double withdrawMoney){
        double sbalance = getBalance();
        if((sbalance - withdrawMoney) > 100){
            sbalance = (sbalance - withdrawMoney);
            setBalance(sbalance);
        }else{
            System.out.println("You can not withdraw "+withdrawMoney);
        }
    }

    public void test(){
        System.out.println("Test");
    }
}
