package Quick_Sort;

/*
        
 Array :
 ----------------------------------------------
 | 41 | 62 | 13 | 84 | 35 | 96 | 57 | 28 | 79 |
 ----------------------------------------------

 */

public class Quick_Sort_main {

    public static void main(String[] args) {

        int[] array = {41, 62, 13, 84, 35, 96, 57, 28, 79};

        QuickSort.quickSort(array);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " , ");
        }

    }

}
