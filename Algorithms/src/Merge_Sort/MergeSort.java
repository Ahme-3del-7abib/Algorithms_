package Merge_Sort;

public class MergeSort {

    public void mergeSort(int[] array) {

        if (array.length < 2) {
            return;
        }

        int mid = array.length / 2;

        int[] arr1 = new int[mid];
        int[] arr2 = new int[array.length - mid];

        for (int i = 0; i < mid; i++) {

            arr1[i] = array[i];
        }

        for (int j = mid; j < array.length; j++) {
            arr2[j - mid] = array[j];
        }

        mergeSort(arr1);
        mergeSort(arr2);

        sort(array, arr1, arr2);
    }

    public void sort(int[] array, int[] arr1, int[] arr2) {

        int i = 0, j = 0, k = 0;
        while (i < arr1.length && j < arr2.length) {

            if (arr1[i] <= arr2[j]) {

                array[k++] = arr1[i++];

            } else {

                array[k++] = arr2[j++];
            }
        }

        while (i < arr1.length) {
            array[k++] = arr1[i++];
        }

        while (j < arr2.length) {
            array[k++] = arr2[j++];

        }
    }

}
