import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        calculatorMenu();
    }


    static void calculatorMenu(){
        Scanner menuScanner = new Scanner(System.in);
        int selectOption;


        System.out.println("---Calculator Menu---");
        System.out.println("[1]-Addition");
        System.out.println("[2]-Subtraction");
        System.out.println("[3]-Division");
        System.out.println("[4]-Multiplication");
        System.out.println("[5]-Exponential Calculation");
        System.out.println("[6]-Mode");
        System.out.println("[7]-Rectangular area and perimeter calculation");
        System.out.println("[8]-EXIT");

        System.out.print("Select the option: ");
        selectOption = menuScanner.nextInt();

        switch (selectOption){

            case 1:
                addition();
                System.out.println();
                calculatorMenu();
                break;

            case 2:
                subtracttion();
                System.out.println();
                calculatorMenu();
                break;

            case 3:
                division();
                System.out.println();
                calculatorMenu();
                break;

            case 4:
                multiplication();
                System.out.println();
                calculatorMenu();
                break;

            case 5:
                exponential();
                System.out.println();
                calculatorMenu();
                break;

            case 6:
                mode();
                System.out.println();
                calculatorMenu();
                break;

            case 7:
                calculateAreaAndPerimeter();
                System.out.println();
                calculatorMenu();
                break;

            case 8:
                System.out.println();
                System.out.println("The calculator is shutting down.");
                System.out.println("Thank you for using us. We wish you a nice day.");
                break;

            default:
                System.out.println();
                System.out.println("Invalid option. Please try again.");
                System.out.println();
                calculatorMenu();
        }

    }


    static void addition(){
        Scanner addScanner = new Scanner(System.in);
        int firstNumber;
        int secondNumber;

        System.out.println();
        System.out.print("Enter the first number: ");
        firstNumber = addScanner.nextInt();
        System.out.print("Enter the second number: ");
        secondNumber = addScanner.nextInt();

        System.out.println("\n"+firstNumber + " + " + secondNumber + " : " + (firstNumber+secondNumber));
    }


    static void subtracttion(){
        Scanner subScanner = new Scanner(System.in);
        int firstNumber;
        int secondNumber;

        System.out.println();
        System.out.print("Enter the first number: ");
        firstNumber = subScanner.nextInt();
        System.out.print("Enter the second number: ");
        secondNumber = subScanner.nextInt();

        System.out.println("\n"+firstNumber + " - " + secondNumber + " : " + (firstNumber-secondNumber));
    }


    static void division(){
        Scanner divScanner = new Scanner(System.in);
        int firstNumber;
        int secondNumber;

        System.out.println();
        System.out.print("Enter the first number: ");
        firstNumber = divScanner.nextInt();
        System.out.print("Enter the second number: ");
        secondNumber = divScanner.nextInt();

        if(secondNumber == 0){
            System.out.println("\nInvalid division operation.. Please try again");
            System.out.println();
            calculatorMenu();
        }

        else{
            System.out.println("\n"+firstNumber + " / " + secondNumber + " : " + (firstNumber/secondNumber));
        }
    }


    static void multiplication(){
        Scanner multiScanner = new Scanner(System.in);
        int firstNumber;
        int secondNumber;

        System.out.println();
        System.out.print("Enter the first number: ");
        firstNumber = multiScanner.nextInt();
        System.out.print("Enter the second number: ");
        secondNumber = multiScanner.nextInt();

        System.out.println("\n"+firstNumber + " * " + secondNumber + " : " + (firstNumber*secondNumber));


    }


    static void exponential(){
        Scanner expoScanner = new Scanner(System.in);
        int firstNumber;
        int secondNumber;
        int total = 1;

        System.out.println();
        System.out.print("Enter the first number: ");
        firstNumber = expoScanner.nextInt();
        System.out.print("Enter the second number: ");
        secondNumber = expoScanner.nextInt();

        for(int i = 1; i <= secondNumber; i++){
            total *= firstNumber;
        }
        System.out.println("\n"+firstNumber + " ^ " + secondNumber + " : " + (total));
    }


    static void mode(){
        Scanner modeScanner = new Scanner(System.in);
        int firstNumber;
        int secondNumber;

        System.out.println();
        System.out.print("Enter the first number: ");
        firstNumber = modeScanner.nextInt();
        System.out.print("Enter the second number: ");
        secondNumber = modeScanner.nextInt();

        System.out.println("\n"+firstNumber + " % " + secondNumber + " : " + (firstNumber % secondNumber));
    }


    static void calculateAreaAndPerimeter(){
        Scanner areaScanner = new Scanner(System.in);
        int firstNumber;
        int secondNumber;

        System.out.println();
        System.out.print("Enter the long side of the rectangle: ");
        firstNumber = areaScanner.nextInt();
        System.out.print("Enter the short side of the rectangle: ");
        secondNumber = areaScanner.nextInt();

        System.out.println("\n" + "Area of rectangle: " + (firstNumber * secondNumber));
        System.out.println("Perimeter of rectangle: " +(2*firstNumber + 2*secondNumber));
    }
}