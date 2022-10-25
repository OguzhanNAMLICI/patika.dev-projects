public class Main {
    public static void main(String[] args) {
           double [] numbers = {1,2,3,4,5};
           double harmonicAvarage = 0.0;

           for(double i : numbers){
               harmonicAvarage += (1.0/i);
           }
           harmonicAvarage = numbers.length / harmonicAvarage;
        System.out.println("Harmonic avarage of the numbers in the array : " +harmonicAvarage);
    }
}