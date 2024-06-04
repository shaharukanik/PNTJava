package classess1;

import classes.SavingsAccount;

public class BankAccountTestt {
    public static void main(String[] args) {
        BankAccountt bankAccountt = new BankAccountt(500);
        System.out.println(bankAccountt.getBalance());
        SavingsAccountt savingsAccountt = new SavingsAccountt(1000);
        savingsAccountt.withdraw(950);
        System.out.println(savingsAccountt.getBalance());

        BankAccountt bankAccountt1 = new SavingsAccountt(600);
        bankAccountt1.withdraw(590);
        System.out.println(bankAccountt1.getBalance());
//        bankAccountt1.test();
    }
}
