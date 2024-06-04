package hw;

public class AccountTest {
    public static void main(String[] args) {
        SavingsAccount sAccount = new SavingsAccount(123);
        sAccount.deposit(1000);
        System.out.println(sAccount.getBalance());
        sAccount.interestCal(5);
        System.out.println(sAccount.getBalance());
        sAccount.toString();
        CurrentAccount currentAccount = new CurrentAccount(567);
        currentAccount.deposit(2000);
        System.out.println(currentAccount.getBalance());
        currentAccount.withdraw(2100);
        System.out.println(currentAccount.getBalance());
        currentAccount.withdraw(2050);
        System.out.println(currentAccount.getBalance());
        currentAccount.withdraw(2090);
        System.out.println(currentAccount.getBalance());
        currentAccount.toString();
    }
}