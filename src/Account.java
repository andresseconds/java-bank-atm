
public abstract class Account {
    private String accountNumber;
    private double balance;
    private String pin;


    //Constructor
    public Account(String accountNumber, double initialBalance, String pin){
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.pin = pin;
    }

    // Getter and Setter
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

    //Métodos
    public abstract void deposit(double amount);
    /*{
        this.balance += amount;
    }*/

    public abstract void withdraw(double amount);

    /*{
        /*if(amount > this.balance){
            throw new ArithmeticException("Saldo insuficiente");
        }
        this.balance -= amount;
    }*/
}
