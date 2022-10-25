import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int conditionNumber;
        int total =0;


        do{
            System.out.print("Enter a Number: ");
            conditionNumber = scanner.nextInt();
            if((conditionNumber % 2 == 0) && (conditionNumber % 4 == 0)){
                total += conditionNumber;
            }

        }while (conditionNumber % 2 == 0);
        System.out.println("Sum of even and multiple of 4 : " +total);
    }
}