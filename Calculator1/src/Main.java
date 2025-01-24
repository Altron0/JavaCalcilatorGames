import java.util.Scanner;
import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to calculator!");

        System.out.print("Enter number a and b:");
        double a = ScannerDouble();
        double b = ScannerDouble();

        System.out.print("Enter type operation:");
        char TypeOperation = ScannerChar();

        Calculator.CalculatorGive(TypeOperation, a, b);

        System.out.println("Get Value:");
        double GetValue = Calculator.CalculatorOperation();
        System.out.println(GetValue);
    }


    public static double ScannerDouble(){
        Scanner scannerDouble = new Scanner(System.in);
        return scannerDouble.nextDouble();
    }


    public static char ScannerChar(){
        Scanner scannerChar = new Scanner(System.in);
        return scannerChar.next().charAt(0);
    }
}