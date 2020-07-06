package Sequential_Search;

/*
        
 Array :
 --------------------------------------------------
 | 21 | 15 | 90 | 11 | 12 | 10 | 25 | 105 | 6 | 11 |       
 -------------------------------------------------- 
        
 Search Seqential - Key = 6
        
 */

public class Sequential_main {

    public static void main(String[] args) {

        int key = 6;
        Object[] array = new Object[]{21, 15, 90, 11, 12, 10, 25, 105, 6, 11};

        SequentialSearch search = new SequentialSearch(key, array);

        if (search.isFound()) {
            System.out.println("Key is fount :) ");
        } else {
            System.out.println("Key isn't fount :( ");
        }
    }

}
