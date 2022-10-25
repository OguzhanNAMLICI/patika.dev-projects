import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber;
        int secondNumber;
        int remainder = 0;
        int greatestCommonDivisor = 0;

        System.out.print("Enter the first number: ");
        firstNumber = scanner.nextInt();
        System.out.print("Enter the second number: ");
        secondNumber = scanner.nextInt();

        while (secondNumber != 0) {

            remainder = firstNumber % secondNumber;
            firstNumber = secondNumber;
            secondNumber = remainder;
            greatestCommonDivisor = firstNumber;
        }


        System.out.println("Greatest common divisor : " + greatestCommonDivisor);

    }
}