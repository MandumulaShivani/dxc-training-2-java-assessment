import java.util.List;
import java.util.Arrays;
import java.util.List;

class ArrayTest {
    public static boolean isUnique(int[] array) {

        int[] List = { 3, 6, 12, 4, 5, 7, 8, 9, 10, 11, 3 };
        for (int i = 0; i < array.length; i++) {
            int min = array[i];

            for (int j = i + 1; j < array.length; j++) {
                if (min > array[j]) {
                    array[i] = array[j];
                    array[j] = min;
                    min = array[i];
                }
            }
        }
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        System.out.println(new ArrayTest().isUnique(new int[] { 3 }));
    }
}