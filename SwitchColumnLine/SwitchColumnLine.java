package SwitchColumnLine;

import java.util.Arrays;

public class SwitchColumnLine {
    public static void main(String[] args) {
        int[][] array = {{10, 50, 87, 63, 40}, {45, 98, 78, 65, 65}, {54, 12, 65, 45, 47}, {45, 5, 87, 98, 45}, {45, 65, 23, 15, 65}};
        int[][] newArray = new int[array.length][array[0].length];

        for (int i = 0; i < array.length; i++) {
            for (int k = 0; k < array[0].length; k++) {
                newArray[k][i] = array[i][k];
            }
        }
        System.out.println(Arrays.toString(newArray[0]));
        System.out.println(Arrays.toString(newArray[1]));
        System.out.println(Arrays.toString(newArray[2]));
        System.out.println(Arrays.toString(newArray[3]));
        System.out.println(Arrays.toString(newArray[4]));

    }
}
