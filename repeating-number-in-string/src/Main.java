public class Main {
    public static void main(String[] args) {

        int[] values = {2,4,4};
        int[] duplicate = new int[values.length];
        int arrayStartIndex = 0;

        for(int i = 0; i < values.length; i++){
            for(int j = 0; j < values.length; j++){
                if((i != j) && (values[i] == values[j])){
                    if(!isFind(duplicate, values[i])){
                        if(values[i] % 2 == 0){
                            duplicate[arrayStartIndex++] = values[i];
                        }
                    }
                    break;
                }
            }
        }

        for(int i : duplicate){
            if(i != 0){
                System.out.println(i);
            }
        }
    }


   public static boolean isFind(int[] array, int value){
        for(int i : array){
            if(i == value){
                return true;
            }
        }
        return false;
   }
}