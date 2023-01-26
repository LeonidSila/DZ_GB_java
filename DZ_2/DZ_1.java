package DZ_2;

import java.util.Arrays;

public class DZ_1 {
    public static void main(String[] args) {
        int[] array = { 9, 4, 7, 3, 5, 7, 3, 5 };
        int list;
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    list = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = list;
                }
            }
        }

        System.out.println(Arrays.toString(array));
    }
}

