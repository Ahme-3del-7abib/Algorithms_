package Quick_Sort;

public class QuickSort {

    public static void quickSort(int[] array) {

        int first = 0;
        int last = array.length - 1;

        sort(array, first, last);
    }

    private static void sort(int[] array, int first, int last) {

        if (first < last) {

            int index = getPivotIndex(array, first, last);
            
            sort(array, first, index - 1);
            sort(array, index + 1, last);
        }
        
    }

    private static int getPivotIndex(int[] array, int first, int last) {

        int pivot = array[first];

        while (first < last) {

            if (array[first] < array[last]) {

                if (array[first] == pivot) {
                    last--;
                } else {
                    first++;
                }

            } else {

                int min = array[last];
                array[last] = array[first];
                array[first] = min;

                if (array[last] == pivot) {
                    first++;
                } else {
                    last--;
                }
            }
        }

        return first;
    }

}
