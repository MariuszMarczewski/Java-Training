package other;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] array = {4, 5, 1, 8, 11};
        System.out.println("Array = " + Arrays.toString(array));

        Training.reverse(array);
        System.out.println("Array = " + Arrays.toString(array));
    }
}
