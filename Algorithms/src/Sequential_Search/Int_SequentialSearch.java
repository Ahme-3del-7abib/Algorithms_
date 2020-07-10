package Sequential_Search;

public class Int_SequentialSearch {

    int key;
    int[] array;

    public Int_SequentialSearch(int key, int[] array) {
        this.key = key;
        this.array = array;
    }

    public boolean isFound() {

        for (int i = 0; i < array.length; i++) {

            if (array[i] == key) {

                if (array[i] > key) {
                    return false;
                }

                return true;
            }
        }
        return false;
    }
}
