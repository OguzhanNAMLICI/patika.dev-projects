import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int temp;
        System.out.print("Enter Array Length: ");
        int arrayLength = scanner.nextInt();
        scanner.nextLine();
        int[] array = new int[arrayLength];
        System.out.println("Enter Array Elements: ");
        for(int i = 0 ; i < arrayLength; i++){
            System.out.print((i+1) + ". elements: ");
            array[i] = scanner.nextInt();
        }

        for(int i = 0; i < array.length; i++){
            for(int j = i + 1; j < array.length; j++){
                if(array[i] > array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        for(int i : array){
            System.out.print(i + "\t");
        }
    }
}