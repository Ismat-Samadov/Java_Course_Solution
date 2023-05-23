import java.util.Arrays;

public class ReverseArray {
    private static void reverse(int[] array) {
        System.out.println("Array = " + Arrays.toString(array));

        int start = 0;
        int end = array.length - 1;
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }

        System.out.println("Reversed array = " + Arrays.toString(array));
    }


}
