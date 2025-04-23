public class SavingAccount extends Account{

    private double interestRate;

    //Constructor
    public SavingAccount(String accountNumber, double initialBalance, double interestRate) {
        super(accountNumber, initialBalance);
        this.interestRate = interestRate;
    }

    public void applyInterest(){
        double interest = getBalance() * interestRate;
        deposit(interest);
    }

}
