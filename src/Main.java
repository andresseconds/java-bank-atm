import java.sql.SQLOutput;
import java.util.ArrayList;

public class Main {
    static int pin = 1234;
    public static void main(String[] args) {

        //Variables básicas
        String accountNumber = "123456789";
        double balance = 1500.75;
        ArrayList<String> transactionHistory = new ArrayList<>();

        deposit(500, balance, transactionHistory);
        withdraw(100, balance, transactionHistory);

        System.out.println("Balance final: "+ balance);
        for (String transaction : transactionHistory){
            System.out.println(transaction);
        }

        //Array de montos de transacciones
        int[] transactionAmounts = {200, -100, 50};

        //Operaciones con variables
        balance += transactionAmounts[0];//Depósito
        if(balance > 0 && pin == 1234){
            System.out.println("Acceso concedido");
        }

        //Uso de operadores
        balance++;  //Incremento
        String status = (balance < 0) ? "Deuda":"Crédito";
        System.out.println("Estado de cuenta"+ status);

    }

    public boolean authenticateUser(String inputPin){
        int attempts = 0;
        while(attempts < 3){
            if (Integer.parseInt(inputPin)  ==  this.pin) {
                return true;
            }else{
                attempts++;
                System.out.println("PIN incorrecto. Intento"+attempts+" de 3");
            }
        }
        return false;
    }

    public static void deposit(double amount, double balance, ArrayList<String> transactionHistory){
        balance += amount;
        transactionHistory.add("Deposit: $"+amount);
    }

    public static boolean withdraw(double amount, double balance, ArrayList<String> transactionHistory){
        if (balance >= amount){
            balance -= amount;
            transactionHistory.add("WithDraw: $"+amount);
            return true;
        }else{
            System.out.println("Insufficient funds");
            return false;
        }
    }
}