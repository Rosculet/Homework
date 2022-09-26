import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int [] str1 = new int[] {0,1,2,2,4,4,4,4};
        checkForDuplication(str1);
    }

    public static void checkForDuplication(int [] array) {
        HashMap <Integer, Integer> integerHashMap = new HashMap();

        for (int i = 0; i < array.length; i++) {
            if (array[i] != i) {
                integerHashMap.put(i, array[i] );
            }
        }
        System.out.println(integerHashMap);
    }
}