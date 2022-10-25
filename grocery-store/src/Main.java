import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pears;
        double apple;
        double tomatoes;
        double banana;
        double eggplant;
        double totalPrice=0;
        System.out.print("How many kilograms of pears: ");
        pears = scanner.nextDouble();

        System.out.print("How many kilograms of pears: ");
        apple = scanner.nextDouble();

        System.out.print("How many kilograms of pears: ");
        tomatoes = scanner.nextDouble();

        System.out.print("How many kilograms of pears: ");
        banana = scanner.nextDouble();

        System.out.print("How many kilograms of pears: ");
        eggplant = scanner.nextDouble();

        totalPrice = totalPrice + ((2.14*pears)+(3.67*apple)+(1.11*tomatoes)+(0.95*banana)+(5.00*eggplant));

        System.out.println("Total amount of the purchase: " + totalPrice);

    }
}