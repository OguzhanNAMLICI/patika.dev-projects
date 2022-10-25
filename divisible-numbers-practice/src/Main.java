import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int enteredNumber;
        double avarage = 0;
        int counter = 0;
        System.out.print("Enter a Number: ");
        enteredNumber = scanner.nextInt();

        for(int i = 0; i<=enteredNumber;i++){
            if(i % 3 == 0 && i % 4 == 0){
                avarage += i;
                counter++;
            }
        }
        System.out.println("Avarage of numbers divisivle by 3 and 4: " +(avarage/counter));
    }
}