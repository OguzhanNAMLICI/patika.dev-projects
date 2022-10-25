import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};
        int[] frequencyArray = new int[arr.length];
        int visited = -1;
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    frequencyArray[j] = visited;
                }
            }
            if (frequencyArray[i] != visited){
                frequencyArray[i] = count;
            }
        }
        System.out.println("Array: " + Arrays.toString(arr));
        for (int i = 0; i < frequencyArray.length; i++) {
            if (frequencyArray[i] != visited)
                System.out.println(arr[i] + " number repeated " + frequencyArray[i] + " times.");
        }
    }
}