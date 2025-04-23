
public class Account {
    private String accountNumber;
    private double balance;


    //Constructor
    public Account(String accountNumber, double initialBalance){
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    //Métodos
    public void deposit(double amount){
        this.balance += amount;
    }

    public void withdraw(double amount){
        if(amount > this.balance){
            throw new ArithmeticException("Saldo insuficiente");
        }
        this.balance -= amount;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
