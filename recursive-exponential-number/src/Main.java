import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int firstNumber;
        int secondNumber;

        System.out.print("Enter the first number: ");
        firstNumber = scanner.nextInt();
        System.out.print("Enter the second number: ");
        secondNumber = scanner.nextInt();
        System.out.println(firstNumber + " ^ " + secondNumber + " : " + recursiveExponential(firstNumber,secondNumber));

    }




    static int recursiveExponential(int firstNumber , int secondNumber){

        int result = 1;
        if(secondNumber == 0){return 1;}
        return firstNumber * recursiveExponential(firstNumber , secondNumber-1);
    }
}