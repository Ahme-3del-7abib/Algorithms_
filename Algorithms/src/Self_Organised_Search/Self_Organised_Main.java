package Self_Organised_Search;

/*

 Array :
 --------------------------------------------------
 | 21 | 15 | 90 | 11 | 12 | 10 | 25 | 105 | 6 | 11 |       
 -------------------------------------------------- 
        
 Search Seqential - Key = 6
        
 */

public class Self_Organised_Main {

    public static void main(String[] args) {

        /*
        
         Search using Move to front algorithm 
        
         */
        Move_to_front list = new Move_to_front();

        list.add(21, 0);
        list.add(15, 1);
        list.add(90, 2);
        list.add(11, 3);
        list.add(12, 4);
        list.add(10, 5);
        list.add(25, 6);
        list.add(105, 7);
        list.add(6, 8);
        list.add(11, 9);

        list.elenmentIsFound(6);
        list.print();

        System.out.println("------------------------------------------------------------------");
        /*               Search using transponse method  algorithm       */
        Transpose_Method tm = new Transpose_Method();

        int key = 6;
        Object[] array = new Object[]{21, 15, 90, 11, 12, 10, 25, 105, 6, 11};

        tm.elementIsFound_transponse(key, array);

    }

}
