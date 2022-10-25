import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        int day;
        int month;

        System.out.print("Enter a Day: ");
        day = scanner.nextInt();
        System.out.print("Enter a Month: ");
        month = scanner.nextInt();

        if(month == 1){
            if(day>= 1 && day <=31){
                if(day < 22){
                    System.out.println("You are a Capricorn");
                }
                else{
                    System.out.println("You are a Aquarius");
                }
            }
            else{
                System.out.println("Invalid day");
            }
        }

        if(month == 2){
            if(day >= 1 && day <= 28){
                if(day < 20){
                    System.out.println("You are a Aquarius");
                }
                else{
                    System.out.println("You are a Pisces");
                }
            }
            else{
                System.out.println("Invalid day");
            }
        }

        if(month == 3){
            if(day >= 1 && day <= 31){
                if(day < 21){
                    System.out.println("You are a Pisces");
                }
                else{
                    System.out.println("You are a Aries");
                }
            }
            else{
                System.out.println("Invalid day");
            }
        }

        if(month == 4){
            if(day >= 1 && day <= 31){
                if(day <21){
                    System.out.println("You are a Aries");
                }
                else{
                    System.out.println("You are a Taurus");
                }
            }
            else{
                System.out.println("Invalid day");
            }
        }

        if(month == 5){
            if(day >= 1 && day <= 31){
                if(day <21){
                    System.out.println("You are a Taurus");
                }
                else{
                    System.out.println("You are a Gemini");
                }
            }
            else{
                System.out.println("Invalid day");
            }
        }

        if(month == 6){
            if(day >= 1 && day <= 31){
                if(day <22){
                    System.out.println("You are a Gemini");
                }
                else{
                    System.out.println("You are a Cancer");
                }
            }
            else{
                System.out.println("Invalid day");
            }
        }

        if(month == 7){
            if(day >= 1 && day <= 31){
                if(day <23){
                    System.out.println("You are a Cancer");
                }
                else{
                    System.out.println("You are a Leo");
                }
            }
            else{
                System.out.println("Invalid day");
            }
        }

        if(month == 8){
            if(day >= 1 && day <= 31){
                if(day <24){
                    System.out.println("You are a Leo");
                }
                else{
                    System.out.println("You are a Virgo");
                }
            }
            else{
                System.out.println("Invalid day");
            }
        }

        if(month == 9){
            if(day >= 1 && day <= 31){
                if(day <24){
                    System.out.println("You are a Virgo");
                }
                else{
                    System.out.println("You are a Libra");
                }
            }
            else{
                System.out.println("Invalid day");
            }
        }

        if(month == 10){
            if(day >= 1 && day <= 31){
                if(day <24){
                    System.out.println("You are a Libra");
                }
                else{
                    System.out.println("You are a Scorpio");
                }
            }
            else{
                System.out.println("Invalid day");
            }
        }

        if(month == 11){
            if(day >= 1 && day <= 31){
                if(day <21){
                    System.out.println("You are a Scorpio");
                }
                else {
                    System.out.println("You are a Sagittarius");
                }
            }
            else{
                System.out.println("Invalid day");
            }
        }

        if(month == 12){
            if(day >= 1 && day <= 31){
                if(day <22){
                    System.out.println("You are a Sagittarius");
                }
                else{
                    System.out.println("You are a Capricorn");
                }
            }
            else{
                System.out.println("Invalid day");
            }
        }


    }
}