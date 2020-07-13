package Merge_Sort;


/*
        
 Array :
 -------------------------
 | 1 | 2 | 3 | 9 | 8 | 7 |
 -------------------------

 */
public class Merge_Sort_main {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 9, 8, 7};

        MergeSort ms = new MergeSort();
        ms.mergeSort(array);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }

}
