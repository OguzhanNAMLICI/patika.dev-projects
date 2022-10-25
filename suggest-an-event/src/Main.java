import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int heat;

        System.out.print("Enter the air temperature: ");
        heat = scanner.nextInt();

        if(heat < 5){
            System.out.println("You can go skiing");
        }

        else if(heat <=25){
            if(heat <=15){
                System.out.println("You can go cinema");
            }
            if(heat >=10){
                System.out.println("You can go picnic");
            }
        }

        else{
            System.out.println("You can go swimming");
        }
    }
}