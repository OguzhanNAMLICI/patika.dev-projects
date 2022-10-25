import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;

        System.out.print("Enter a Year: ");
        year = scanner.nextInt();

        if(year % 4 == 0 && year % 100 != 0){
            System.out.println(year + " is a leap year.");
        }

        else if ((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0) ){
            System.out.println(year + " is a leap year.");
        }

        else{
            System.out.println("The year you entered is not a leap year.");
        }
    }
}