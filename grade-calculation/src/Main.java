import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Declare a Scanner Object
        Scanner inputScanner = new Scanner(System.in);

        //Declare variables
        int mathematic,physic,chemistry,history,music;


        System.out.print("Mathematic Grade: ");
        mathematic = inputScanner.nextInt();

        System.out.print("Physic Grade: ");
        physic = inputScanner.nextInt();

        System.out.print("Chemistry Grade: ");
        chemistry = inputScanner.nextInt();

        System.out.print("History Grade: ");
        history = inputScanner.nextInt();

        System.out.print("Music Grade: ");
        music = inputScanner.nextInt();

         int finalGrade = (mathematic+physic+chemistry+history+music);
         double gradeAvarage = finalGrade / 5;
         String result = (gradeAvarage)>60 ? "Passed the Class":"You Failed";
        System.out.println("Grade Avarage: " + gradeAvarage);
        System.out.println(result);

    }
}