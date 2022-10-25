import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Create scanner object
        Scanner taxScanner = new Scanner(System.in);

        //value added tax
        double valueAddedTaxRate = 0.18;

        System.out.print("Enter Balance: ");
        double balance = taxScanner.nextDouble();

        double valueAddedTaxAmount = balance * valueAddedTaxRate;
        double valueAddedTax = balance + valueAddedTaxAmount;
        System.out.println("Value Added Tax Free: " + balance);
        System.out.println("Value Added Tax Rate: " + valueAddedTaxRate);
        System.out.print("Value Added Tax Amount: "+ valueAddedTaxAmount+ "\n");
        System.out.println("Value Added Tax: " + valueAddedTax);
    }
}