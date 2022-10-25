import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[][] array = new int[2][3];
        int[][] transposeArray = new int[3][2];

        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 3; j++){
                System.out.print("Enter number: ");
                array[i][j] = scanner.nextInt();
            }
        }

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 2; j++){
                transposeArray[i][j] = array[j][i];
            }
        }


        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 2; j++){
                System.out.print(transposeArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}