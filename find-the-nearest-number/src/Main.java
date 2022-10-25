import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] list = {15,12,788,1,-1,-778,2,0};

        System.out.println("Array: " + Arrays.toString(list));

        System.out.print("Entered Number: ");

        int number = scanner.nextInt();

        findNearestNumbers(list ,number);

    }

    public  static void findNearestNumbers(int[] list , int number){
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));

        int minNumberCounter = 0;
        int maxNumber=0;

        for(int i = 0 ; i <list.length; i++){
            if(list[i] < number){
                minNumberCounter++;
            }
        }

        int[] minNumber = new int[minNumberCounter];

        for(int i = 0 ; i < minNumberCounter ; i++){
            minNumber[i] = list[i];
        }


        for(int i = 0; i < list.length; i ++ ){
            if(list[i] > number){
                maxNumber = list[i];
                break;
            }
        }

        System.out.println(Arrays.toString(minNumber));

        System.out.println("Greatest number less than " + number +": "+ minNumber[minNumberCounter-1]);
        System.out.println("Smallest number greater than " + number + ": " + maxNumber);
    }
}