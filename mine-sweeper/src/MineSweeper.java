import java.util.Random;
import java.util.Scanner;

public class MineSweeper {

    Random random = new Random();
    private Scanner scanner = new Scanner(System.in);
    private int rowNumber;
    private int colNumber;
    private int size;
    private String[][] gameArea;
    private String[][] minePlaces;
    private boolean game = true;


    public MineSweeper(int rowNumber, int colNumber){
        this.rowNumber = rowNumber;
        this.colNumber = colNumber;
        this.minePlaces = new String[rowNumber][colNumber];
        this.gameArea = new String[rowNumber][colNumber];
        this.size = (rowNumber * colNumber);
    }


    public void run(){
        int emptyCelss = (rowNumber*colNumber) - ((rowNumber*colNumber)/4);
        setMinePlaces();
        print2dArray(minePlaces);
        System.out.println("=====================");
        System.out.println("The Game Begins");
        prepareGameArea();
        while (game){
            print2dArray(gameArea);
            System.out.print("Enter Row: ");
            int xAxis = scanner.nextInt();
            System.out.print("Enter Col: ");
            int yAxis = scanner.nextInt();

            if((xAxis < 0 || xAxis > rowNumber-1) || (yAxis < 0 || yAxis > colNumber-1)){
                System.out.println("Invalid Coordinates");
                continue;
            }

            if(minePlaces[xAxis][yAxis] != "*"){
                if(emptyCelss == 0){
                    System.out.println("Win");
                    print2dArray(minePlaces);
                    return;
                }
                this.gameArea[xAxis][yAxis] = Integer.toString(calculateNearbyMines(xAxis,yAxis));
                emptyCelss--;

            }else{
                game = false;
                System.out.println("\nGame Over\n");
                print2dArray(minePlaces);
            }

        }


    }


    private void prepareGameArea(){
        for(int i = 0; i < rowNumber; i++){
            for(int j = 0; j < colNumber; j++){
                gameArea[i][j] = "-";
            }
        }
    }

    private void setMinePlaces(){
        int count = 0;

        for(int i = 0; i < rowNumber; i++){
            for(int j = 0; j < colNumber; j++){
                minePlaces[i][j] = "-";
            }
        }

        while (count != ((rowNumber * colNumber) / 4)){
            int xAxis = random.nextInt(rowNumber);
            int yAxis = random.nextInt(colNumber);
            if(minePlaces[xAxis][yAxis] != "*"){
                minePlaces[xAxis][yAxis] = "*";
            }
            count++;
        }
    }

    private void print2dArray(String[][]array){
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

    private int calculateNearbyMines(int xAxis, int yAxis){
        int count = 0;
        for (int i = 0; i < minePlaces.length; i++) {
            for (int j = 0; j < minePlaces[i].length; j++) {
                if(minePlaces[i][j] == "*" && Math.abs(xAxis-i)<=1 && Math.abs(yAxis-j)<=1){
                    count++;
                }
            }
        }
        return count;
    }

}
