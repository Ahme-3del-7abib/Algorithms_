package Sequential_Search;

/*
        
 Array :
 --------------------------------------------------
 | 21 | 15 | 90 | 11 | 12 | 10 | 25 | 105 | 6 | 11 |       
 -------------------------------------------------- 
        
 Search Seqential - Key = 6
        
 */
public class Sequential_main<T> {

    public static void main(String[] args) {

        char key = 'a';
       
        Object[] array = new Object[]{'a', 'b', 'c', 'd', 'f', 'g', 'h', 'i', 'j', 'k'};

        SequentialSearch search = new SequentialSearch(key, array);

        if (search.isFound()) {
            System.out.println("Key is fount :) ");
        } else {
            System.out.println("Key isn't fount :( ");
        }
    }
}
