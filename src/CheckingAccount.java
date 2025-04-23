public class CheckingAccount extends Account{

    public CheckingAccount(String accountNumber, double initialBalance, String pin) {
        super(accountNumber, initialBalance, pin);
    }

    @Override
    public void deposit(double amount) {
        //Implementación de depósito

    }

    @Override
    public void withdraw(double amount) {
        if(amount > getBalance()){
            throw new ArithmeticException("Saldo insuficiente");
        }
        //Lógica específica de retiro
    }
}
