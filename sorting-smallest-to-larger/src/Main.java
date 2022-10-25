import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        int firstNumber;
        int secondNumber;
        int thirdNumber;


        System.out.print("Enter first number: ");
        firstNumber = scanner.nextInt();
        System.out.print("Enter second number: ");
        secondNumber = scanner.nextInt();
        System.out.print("Enter third number: ");
        thirdNumber = scanner.nextInt();

        if((firstNumber<secondNumber) && (firstNumber<thirdNumber)){
            if(secondNumber<thirdNumber){
                System.out.println(firstNumber + " < " + secondNumber + " < " + thirdNumber);
            }
            else{
                System.out.println(firstNumber + " < " + thirdNumber + " < " +secondNumber);
            }
        }

        else if((secondNumber<firstNumber) && (secondNumber<thirdNumber)){
            if(firstNumber<thirdNumber){
                System.out.println(secondNumber + " < " + firstNumber + " < " + thirdNumber);
            }
            else{
                System.out.println(secondNumber + " < " + thirdNumber + " < " + firstNumber);
            }
        }

        else{
            if(firstNumber<secondNumber){
                System.out.println(thirdNumber + " < " + firstNumber + " < " + secondNumber);
            }
            else{
                System.out.println(thirdNumber + " < " + secondNumber + " < " + firstNumber);
            }
        }
    }
}