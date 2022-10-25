import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double PI = 3.14;
        double r;
        double angle;
        double areaOfTheCircle;
        System.out.print("Enter circle radius: ");
        r = scanner.nextDouble();
        System.out.print("Enter circle angle: ");
        angle = scanner.nextDouble();
        areaOfTheCircle = ((PI*(r*r)*angle)/360);
        System.out.println("Area of The Circle: "+ areaOfTheCircle);

    }
}