package classes;

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account(22445, "Anik");
//        account.setAccountNumber(224455);
        System.out.println(account.getAccountNumber());
        account.setBalance(100);
        System.out.println(account.getBalance());
        System.out.println(account.getName());
        account.withdrawMoney(300);

        CheckingAccount checkingAccount = new CheckingAccount(445566,"Adib");
        System.out.println(checkingAccount.getName());
        checkingAccount.setBalance(70.5);
        System.out.println(checkingAccount.getBalance());

        SavingsAccount savingsAccount = new SavingsAccount(243433,"Anik");
        savingsAccount.setBalance(500);
        System.out.println(savingsAccount.getName());
        savingsAccount.addInterest(10);
        System.out.println(savingsAccount.getBalance());
        savingsAccount.withdrawMoney(50);
        savingsAccount.withdrawMoney(50);
        savingsAccount.withdrawMoney(50);
        savingsAccount.withdrawMoney(50);
        System.out.println("*********");
        savingsAccount.withdrawMoney(50);
        System.out.println(savingsAccount.getBalance());
    }
}
