import java.util.Scanner;

public class Calculator {

    private Scanner scanner = new Scanner(System.in);

    public void start() {
        System.out.println("Ingrese el primer número: ");
        double  num1 = scanner.nextDouble();

        System.out.println("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.println("Elija una operación: \n1. Suma\n2. Resta\n3.Mulplicaión\n4.División");
        int opc = scanner.nextInt();

        double result;
        switch(opc){
            case 1:
                result = add(num1, num2);
                break;
            case 2:
                result = substrac(num1, num2);
                break;
            case 3:
                result = multiply(num1, num2);
                break;
            case 4:
                result = divide(num1, num2);
                break;
        }
    }

    public double add(double a, double b){
        return a+b;
    }

    public double substrac(double a, double b){
        return a-b;
    }

    public double multiply(double a, double b){
        return a*b;
    }

    public double divide(double a, double b){
        if (b != 0 ){
            return a/b;
        }else {
            throw new ArithmeticException("División por cero.");
        }
    }
}
