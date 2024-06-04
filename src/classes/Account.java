package classes;

public class Account {
    private int accountNumber;
    private String name;
    private double balance;
    private String phone;
    private String email;

    Account(int accountNumber, String name){
        this.accountNumber = accountNumber;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if(balance>0){
            this.balance = balance;
        } else{
            System.out.println("Add a positive balance");
        }
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void depositMoney(double depositAmmount){
        balance = balance+depositAmmount;
//        balance += depositAmmount;
    }

//    Make sure I can not withdraw more than my balance
    public void withdrawMoney(double withdrawAmmount){
        if(balance >= withdrawAmmount){
            balance = balance-withdrawAmmount;
//            balance -= withdrawAmmount;
        }else{
            System.out.println("You can not withdraw "+ withdrawAmmount);
            System.out.println("Your balance is "+balance);
        }
    }
}
