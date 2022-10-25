import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int distance;
        int passengerAge;
        int flightType;
        int ticketPrice = 0;
        double fee_Per_Distance = 0.10;
        double kidDiscount = 0.50;
        double youngDiscount = 0.10;
        double oldDiscount = 0.30;
        double roundTripDiscount = 0.20;

        System.out.print("Enter the Distance in KM: ");
        distance = scanner.nextInt();
        System.out.print("Enter Your Age: ");
        passengerAge = scanner.nextInt();
        System.out.println("Flight Types");
        System.out.println("[1]-One Direction.");
        System.out.println("[2]-Round Trip.");
        System.out.print("Enter Your Flight Type: ");
        flightType = scanner.nextInt();




        if((passengerAge>0) && (distance>0) && (flightType==1 || flightType == 2)){
            if(passengerAge<12){
                if(flightType == 2){
                    ticketPrice += distance * fee_Per_Distance;
                    ticketPrice = (int) (ticketPrice - (ticketPrice* kidDiscount));
                    ticketPrice = (int) (ticketPrice - (ticketPrice*roundTripDiscount));
                    System.out.println("Total Amount: " + (ticketPrice*2) +"$");
                }
                else{
                    ticketPrice += distance * fee_Per_Distance;
                    ticketPrice = (int) (ticketPrice - (ticketPrice* kidDiscount));
                    System.out.println("Total Amount: " + ticketPrice +"$");
                }
            }



            //If the person is between the ages of 12-24
            else if(passengerAge>12 && passengerAge<24){
                if(flightType == 2){
                    ticketPrice += distance * fee_Per_Distance;
                    ticketPrice = (int) (ticketPrice - (ticketPrice* youngDiscount));
                    ticketPrice = (int) (ticketPrice - (ticketPrice*roundTripDiscount));
                    System.out.println("Total Amount: " + (ticketPrice*2) +"$");
                }
                else{
                    ticketPrice += distance * fee_Per_Distance;
                    ticketPrice = (int) (ticketPrice - (ticketPrice* youngDiscount));
                    System.out.println("Total Amount: " + ticketPrice +"$");
                }
            }



            //If this person is over 65 years old.
            else if(passengerAge>65){
                if(flightType == 2){
                    ticketPrice += distance * fee_Per_Distance;
                    ticketPrice = (int) (ticketPrice - (ticketPrice* oldDiscount));
                    ticketPrice = (int) (ticketPrice - (ticketPrice*roundTripDiscount));
                    System.out.println("Total Amount: " + (ticketPrice*2) +"$");
                }
                else{
                    ticketPrice += distance * fee_Per_Distance;
                    ticketPrice = (int) (ticketPrice - (ticketPrice* oldDiscount));
                    System.out.println("Total Amount: " + ticketPrice +"$");
                }
            }



            //If this person is between the ages of 25-65
            else {
                if(flightType == 2){
                    ticketPrice += distance * fee_Per_Distance;
                    ticketPrice = (int) (ticketPrice - (ticketPrice*roundTripDiscount));
                    System.out.println("Total Amount: " + (ticketPrice*2) +"$");
                }
                else{
                    ticketPrice += distance * fee_Per_Distance;
                    System.out.println("Total Amount: " + ticketPrice +"$");
                }
            }



        }
        else{
            System.out.println("Invalid Data Entered.");
            System.out.println("Please Try Again.");
        }


    }
}