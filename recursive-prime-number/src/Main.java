import java.io.PrintStream;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int primeNumber;
        System.out.print("Enter the number: ");
        primeNumber = scanner.nextInt();
        if(isPrime(primeNumber,2)){
            System.out.println("The number " + primeNumber + " is a prime number.");
        }
        else{
            System.out.println("The number" + primeNumber + " is not a prime number.");
        }




    }

    public static boolean isPrime(int n , int i)
    {
        // Base cases
        if (n <= 2)
            return (n == 2) ? true : false;
        if (n % i == 0)
            return false;
        if (i * i > n)
            return true;

        // Check for next divisor
        return isPrime(n, i + 1);
    }
}