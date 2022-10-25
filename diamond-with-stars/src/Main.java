import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.print("Enter the maximum number of the stars: ");
        number = scanner.nextInt();

        
        for(int i = 1; i <= number; i++){

            for(int j = 1; j<=(number-i); j++){
                System.out.print(" ");
            }

            for(int k = 1; k <= (2*i-1); k++){
                System.out.print("*");
            }
            System.out.println();
        }


        for(int i = (number-1); i>0 ; i--) {

            for (int j = 1; j <= (number - i); j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}