public class SavingAccount extends Account{

    private double interestRate;

    //Constructor
    public SavingAccount(String accountNumber, double initialBalance, String pin, double interestRate) {
        super(accountNumber, initialBalance, pin);
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount) {

    }

    @Override
    public void withdraw(double amount) {

    }

    public void applyInterest(){
        double interest = getBalance() * interestRate;
        deposit(interest);
    }

}
