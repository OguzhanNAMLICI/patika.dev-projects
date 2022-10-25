import jdk.jshell.spi.SPIResolutionException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int firstEdge,secondEdge,thirdEdge;
        double hypotenuse;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first edge: ");
        firstEdge = scanner.nextInt();
        System.out.print("Enter second edge: ");
        secondEdge = scanner.nextInt();
        System.out.print("Enter third edge: ");
        thirdEdge = scanner.nextInt();



        double perimeterofTriangle = ((firstEdge+secondEdge+thirdEdge)/2);
        System.out.println("Perimeter of Triangle: " + perimeterofTriangle);
        double areaOfTriangle = Math.sqrt(perimeterofTriangle*(perimeterofTriangle-firstEdge)*(perimeterofTriangle-secondEdge)*(perimeterofTriangle-thirdEdge));
        System.out.println("Area of Triangle: "+areaOfTriangle);


        hypotenuse = Math.sqrt((firstEdge*firstEdge)+(secondEdge*secondEdge));
        System.out.println("Hypotenuse: " + hypotenuse);


    }
}