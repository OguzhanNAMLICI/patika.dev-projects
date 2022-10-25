import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.print("Enter the number: ");
        number = scanner.nextInt();
        if(number > 0) {
            plusFive(minusFive(number),number);
        }
    }

    static int minusFive(int number){
        if(number <= 0){
            return number;
        }
        else{
            System.out.print(number + " ");
            return minusFive(number-5);
        }
    }

    static int plusFive(int number ,  int temp){
        if(number > temp){
            return number;
        }
        else{
            System.out.print(number + " ");
            return plusFive(number+5,temp);
        }
    }


}