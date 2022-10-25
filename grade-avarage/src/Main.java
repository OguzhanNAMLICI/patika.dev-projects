import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double mathematic;
        double physic;
        double chemistry;
        double music;
        double history;
        double lessonAvarage = 0;

        System.out.print("Mathematic: ");
        mathematic = scanner.nextDouble();
        if(mathematic>=0 && mathematic<=100){
            lessonAvarage +=mathematic;
        }

        System.out.print("Physic: ");
        physic = scanner.nextDouble();
        if(physic>=0 && physic<=100){
            lessonAvarage +=physic;
        }

        System.out.print("Chemistry: ");
        chemistry = scanner.nextDouble();
        if(chemistry>=0 && chemistry<=100){
            lessonAvarage+=chemistry;
        }

        System.out.print("History:");
        history = scanner.nextDouble();
        if(history>=0 && history<=100){
            lessonAvarage+=history;
        }

        System.out.print("Music: ");
        music = scanner.nextDouble();
        if (music>=0 && music<=100){
            lessonAvarage+=music;
        }

        System.out.println("Average of your classes: " + (lessonAvarage/5.0));

        if(lessonAvarage>=55){
            System.out.println("You passed the class");
        }
        else{
            System.out.println("You failed the class");
        }

    }
}