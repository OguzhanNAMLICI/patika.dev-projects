import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfDigits;

        System.out.print("Enter the number of digits: ");
        numberOfDigits = scanner.nextInt();

        for (int i = numberOfDigits; i > 0; i--) {

            for (int j = 1; j <= (numberOfDigits - i); j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}