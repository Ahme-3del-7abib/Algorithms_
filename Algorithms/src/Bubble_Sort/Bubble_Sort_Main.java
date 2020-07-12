package Bubble_Sort;

/*
        
 Array :
 -------------------------
 | 6 | 8 | 4 | 5 | 9 | 2 |
 -------------------------

 */
public class Bubble_Sort_Main {

    public static void main(String[] args) {

        int[] array = new int[]{6, 8, 4, 5, 9, 2};

        sortMin(array);

        for (int x = 0; x < array.length; x++) {
            System.out.println(array[x]);
        }
    }

   
    public static void sortMin(int[] array) {

        for (int i = array.length - 1; i >= 0; i--) {

            for (int j = i - 1; j >= 0; j--) {

                if (array[i] < array[j]) {

                    int min = array[i];
                    array[i] = array[j];
                    array[j] = min;
                }

            }

        }

    }

    public static void sortMax(int[] array) {

        for (int i = array.length - 1; i >= 0; i--) {

            for (int j = i - 1; j >= 0; j--) {

                if (array[i] > array[j]) {

                    int min = array[i];
                    array[i] = array[j];
                    array[j] = min;
                }

            }

        }

    }

}
