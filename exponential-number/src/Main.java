import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int primeNumber;
        int exponentNumber;
        int result = 1;

        System.out.print("Enter the number to be exponentiated: ");
        primeNumber = scanner.nextInt();
        System.out.print("Enter the number to be exponent: ");
        exponentNumber = scanner.nextInt();

        for(int i = 0; i<exponentNumber; i++){
            result *= primeNumber;
        }

        System.out.println(primeNumber + "^" + exponentNumber + " :" + result);
    }
}