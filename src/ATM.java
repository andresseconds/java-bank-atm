import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ATM {
    private Calculator calculator = new Calculator();
    private List<Account> accounts;

    //Constructor
    public ATM(){
        this.accounts = new ArrayList<>();
    }

    //Agrega cuentas al listado de cuentas
    public void addAccount(Account account){
        this.accounts.add(account);
    }

    public Account getAccount(String accountNumber){
        for(Account account : accounts){
            if (account.getAccountNumber().equals(accountNumber)){
                return account;
            }
        }
        return null;
    }


    public void start(){
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while(!exit){
            System.out.println("Bienvenido a JavaBank ATM.");
            System.out.println("Seleccione una operación:");
            System.out.println("1. Realizar una transacción");
            System.out.println("2. Usar la calculadora");
            System.out.println("0. Salir");
            int choice = scanner.nextInt();

            switch (choice){
                case 1:
                    //Lógica de transacción
                    break;
                case 2:
                    calculator.start();
                    break;
                case 3:
                    exit = true;
                    break;
                default:
                    System.out.println("Ingrese una opción valida");
                    break;
            }
        }
    }
}
