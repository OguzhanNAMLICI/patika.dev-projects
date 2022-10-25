import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumberCombination = 1;
        int secondNumberCombination = 1;
        int thirdNumberCombination = 1;
        int combinationTotal;
        int firstNumber;
        int secondNumber;

        System.out.print("Enter the first number: ");
        firstNumber = scanner.nextInt();
        System.out.print("Enter the second number: ");
        secondNumber = scanner.nextInt();

        /*
         *Combination Formula
         * C(n,r) = n! / (r! * (n-r)!)
        */

        for(int i = 1; i <= firstNumber; i++){
            firstNumberCombination = firstNumberCombination * i;
        }

        for(int i = 1; i <= secondNumber; i++){
            secondNumberCombination = secondNumberCombination*i;
        }

        for(int i = 1; i <= (firstNumber-secondNumber); i++){
            thirdNumberCombination = thirdNumberCombination * i;
        }

        combinationTotal = (firstNumberCombination) /(secondNumberCombination*(thirdNumberCombination));
        System.out.println("C(n,r): " +combinationTotal);


    }
}