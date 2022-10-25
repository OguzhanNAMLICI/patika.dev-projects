import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int limitNumber;

        
        System.out.print("Enter the limit of the loop: ");
        limitNumber = scanner.nextInt();

        System.out.println("Powers of 4 less than the entered number");
        for(int i = 1; i<limitNumber; i *= 4){
            System.out.println(i);
        }

        System.out.println("\n");

        System.out.println("Powers of 5 less than the entered number");
        for(int i = 1; i<limitNumber; i *= 5){
            System.out.println(i);
        }
    }
}