package Sequential_Search;

public class SequentialSearch<T> {

    T key;
    Object[] array;

    public SequentialSearch(T key, Object[] array) {
        this.key = key;
        this.array = array;
    }

    public boolean isFound() {

        for (int i = 0; i < array.length; i++) {

            if (array[i] == key) {
                return true;
            }
        }
        return false;
    }
}
