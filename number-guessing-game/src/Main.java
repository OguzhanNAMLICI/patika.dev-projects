import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int number = rand.nextInt(100);
        int remainingLife = 5;
        int right = 0;
        int selected;
        int[] guess = new int[5];
        boolean isWrong = false;
        boolean isWin = false;


        while(right < 5){
            System.out.print("Enter a number");
            selected = scanner.nextInt();

            if( selected < 0 || selected > 99){
                System.out.println("Please enter a value between 0-100.");
                if(isWrong){
                    right++;
                    System.out.println("You made too many incorrect entries. Remaining right: "+ (5 - right));
                }else{
                    isWrong = true;
                    System.out.println("One more wrong entry will be deducted from your right.");
                }
                continue;
            }

            if(selected == number){
                System.out.println("Congratulations, correct guess! Number you guessed: " + number);
                isWin = true;
                break;
            }else{
                System.out.println("Incorrect Number");
                if(selected > number){
                    System.out.println(selected + " number is greater than the hidden number.");
                }else{
                    System.out.println(selected + " number is less than the hidden number.");
                }

                guess[right++] = selected;
                System.out.println("Remaining Life: " + (5 - right));
            }
        }


        if(!isWin){
            System.out.println("Game Over");
            if(!isWrong){
                System.out.println("Your Guess: " + Arrays.toString(guess));
            }
        }


    }
}