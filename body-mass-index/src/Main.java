import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double weight,height,bodyMassIndex;

        System.out.print("Enter Weight: ");
        weight = scanner.nextDouble();

        System.out.print("Enter Height: ");
        height = scanner.nextDouble();

        bodyMassIndex = weight/Math.pow(height,2);
        System.out.println("Body Mass Index: "+ bodyMassIndex);
    }
}