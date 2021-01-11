package SelectionSort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {10, 55, 322, 101, 323, 212, 4541, 10, 55, 55, 322, 10, 698, 10, 687};


        for (int i = 0; i < array.length; i++) {
            int min  = array[i];
            int minIndex = i;

            for (int p = i+1; p < array.length; p++) {
                if (array[p] < min) {
                    min = array[p];
                    minIndex = p;
                }
            }
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
}
