import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int sumOfDigits=0;
        int digitNumberValue;

        System.out.print("Enter the number: ");
        number = scanner.nextInt();

        do{
            digitNumberValue = number % 10;
            sumOfDigits += digitNumberValue;
            number = number / 10;

        }while (digitNumberValue != 0);

        System.out.println("The sum of the digits of the entered number: " + sumOfDigits);
    }
}