import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int loopCount;
        int number;
        int maximumNumber=0;
        int minimumNumber=0;

        System.out.print("Enter the loop counter: ");
        loopCount = scanner.nextInt();

        for (int i = 0; i < loopCount; i++) {
            System.out.print("Number: ");
            number = scanner.nextInt();

            if(i == 1){
                maximumNumber = number;
                minimumNumber = number;
            }

            else{
                if(number>maximumNumber){ maximumNumber = number;}
                else if(number < minimumNumber){minimumNumber = number;}
            }
        }

        System.out.printf("Max: %d%n", maximumNumber);
        System.out.printf("Min: %d%n", minimumNumber);
    }
}