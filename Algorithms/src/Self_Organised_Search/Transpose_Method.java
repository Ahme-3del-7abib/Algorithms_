package Self_Organised_Search;

/**
 *
 * @author Simplx
 */
public class Transpose_Method<T> {

    public  void elementIsFound_transponse(T key, Object[] array) {

        for (int i = 0; i < array.length; i++) {

            if (array[i] == key) {
                T z;
                z = (T) array[i];
                array[i] = array[i - 1];
                array[i - 1] = z;
                System.out.println("element found ");
                return;
            }
        }

        System.out.println("Not found ...");
    }
}
