import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double firstNumber,secondNumber;
        char select;

        System.out.println("---Calculator Menu---");
        System.out.println("[1]- '+' ");
        System.out.println("[2]- '-' ");
        System.out.println("[3]- '*' ");
        System.out.println("[4]- '/' ");

        System.out.print("Enter First Number: ");
        firstNumber = scanner.nextInt();
        System.out.print("Enter Second Number: ");
        secondNumber = scanner.nextInt();
        System.out.print("Enter an Option:  ");
        select = scanner.next().charAt(0);

        switch (select){
            case '+':
                System.out.println(firstNumber + " + " + secondNumber + ": " + (firstNumber+secondNumber));
                break;

            case '-':
                System.out.println(firstNumber + " - " + secondNumber + ": " + (firstNumber-secondNumber));
                break;

            case '*':
                System.out.println(firstNumber + " * " + secondNumber + ": " + (firstNumber*secondNumber));
                break;

            case '/':
                if(secondNumber != 0){
                    System.out.println(firstNumber + " + " + secondNumber + ": " + (firstNumber/secondNumber));
                }
                else{
                    System.out.println("A number cannot be divided by '0' ");
                }
                break;
                
            default:
                System.out.println("Please Choose a Right Option");
        }
    }
}