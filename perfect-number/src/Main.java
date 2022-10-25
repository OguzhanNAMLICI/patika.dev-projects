import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int perfectNumber;
        int total = 0;

        System.out.print("Enter the number: ");
        perfectNumber = scanner.nextInt();

        for(int i = 1; i < perfectNumber; i++){

            if(perfectNumber % i == 0){
                total += i;
            }
        }
        if(perfectNumber == total){
            System.out.println("This number is a perfect number.");
        }

        else{
            System.out.println("This number is not a perfect number.");
        }
    }
}