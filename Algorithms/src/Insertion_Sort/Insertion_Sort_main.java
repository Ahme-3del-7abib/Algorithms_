package Insertion_Sort;

import java.util.ArrayList;
import java.util.List;

/*
        
 Array :
 ---------------------------
 | 10 | 5 | 7 | 8 | 15 | 9 |
 ---------------------------

 */

public class Insertion_Sort_main {

    public static void main(String[] args) {

        int[] array = new int[]{10, 5, 7, 8, 4, 15, 9};

        sortMin(array);
        for (int x = 0; x < array.length; x++) {
            System.out.println(array[x]);
        }
    }

    public static void sortMin(int[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < i; j++) {

                if (array[i] < array[j]) {

                    int min = array[i];
                    array[i] = array[j];
                    array[j] = min;

                }
            }
        }
    }
}
