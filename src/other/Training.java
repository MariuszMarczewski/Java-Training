package other;

import java.util.Arrays;

public class Training {

    public static int getMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length - 1; i++) {
            int temp = array[i];
            if (temp < min) {
                min = temp;
            }
        }
        return min;
    }

    public static void reverse(int[] array) {

        int maxIndex = array.length -1;
        int halfLength = array.length / 2;
        for(int i=0; i< halfLength; i++) {
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }
    }
}
