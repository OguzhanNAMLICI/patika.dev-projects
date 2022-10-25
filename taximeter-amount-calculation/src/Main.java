import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int distance;
        int openingKilometerAmount = 10;
        int minimumPaidAmount = 20;
        double amountPaid;
        double perKilometer = 2.20;

        System.out.print("Enter the Distance in KM: ");
        distance = scanner.nextInt();
        amountPaid = openingKilometerAmount + (distance * perKilometer);
        if(amountPaid < 20){
            System.out.println("Total Amount: " + amountPaid);
            System.out.println("Minimum amount to be paid: " +minimumPaidAmount +" $");
        }
        else{
            System.out.println("Total Amount: " + amountPaid);
            System.out.println("Amount to be paid: " + amountPaid + " $");
        }
        
    }
}