package Selection_sort;

/*
        
 Array :
 -------------------------
 | 8 | 6 | 9 | 4 | 2 | 5 |
 -------------------------

 */
public class Selection_sort_main {

    public static void main(String[] args) {

        int[] array = new int[]{8, 6, 9, 4, 2, 5};

        sortMin(array);

        for (int x = 0; x < array.length; x++) {
            System.out.println(array[x]);
        }
    }

    public static void sortMin(int[] array) {

        for (int i = 0; i < array.length; i++) {

            int min = array[i];

            for (int j = 0; j < array.length; j++) {

                if (array[i] < array[j]) {

                    min = array[j];
                    array[j] = array[i];
                    array[i] = min;
                }
            }
        }

    }

    public static void sortMax(int[] array) {

        for (int i = 0; i < array.length; i++) {

            int min = array[i];

            for (int j = 0; j < array.length; j++) {

                if (array[i] > array[j]) {

                    min = array[j];
                    array[j] = array[i];
                    array[i] = min;
                }
            }
        }
    }

}
