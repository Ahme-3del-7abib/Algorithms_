package BinarySearch;


/*
        
 Array :
 --------------------------------------------------------
 | 20 | 23 | 30 | 50 | 62 | 105 | 500 | 610 | 720 | 900 |       
 --------------------------------------------------------
        
 Search Seqential - Key = 23
        
 */

public class Binary_Search_main {

    public static void main(String[] args) {

        int key = 23;
        int[] array = new int[]{20, 23, 30, 50, 62, 105, 500, 610, 720, 900};


        binary_Search.check(0, array.length - 1, key, array);
        binary_Search.isFound(0, array.length - 1, key, array);

    }

}
