import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int palindromeNumber;

        System.out.print("Enter the number: ");
        palindromeNumber = scanner.nextInt();

        System.out.println("Is the number " + palindromeNumber + " a palindrome: " + isPalindromeNumber(palindromeNumber));
    }


     static boolean isPalindromeNumber(int number){

         int temp = number;
         int lastNumber;
         int reverseNumber = 0;

        while( temp != 0){

            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10 ;
        }

        if(reverseNumber  == number){return true;}

        else {return false;}
     }
}