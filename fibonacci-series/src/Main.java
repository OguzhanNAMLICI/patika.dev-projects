import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seriesLength;
        int nextTerm;
        int firstTerm = 0;
        int secondTerm = 1;


        System.out.print("Enter the series length: ");
        seriesLength = scanner.nextInt();


        System.out.print(seriesLength + " Element Fibonacci Series: ");

        for(int i = 1; i<=seriesLength; i++){
            System.out.print(firstTerm + ",");
            nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}