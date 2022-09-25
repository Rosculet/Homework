import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int [] str1 = new int[] {0,1,2,2,4,4,4,4};
        checkForDuplication(str1);
    }

    public static void checkForDuplication(int [] array) {
        ArrayList<Integer> list = new ArrayList();

        for (int i = 0; i < array.length; i++) {
            if (array[i] != i) {
                list.add(array[i]);
                list.add(i);
            }
        }
        System.out.println(list);
    }
}