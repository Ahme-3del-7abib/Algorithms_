package BinarySearch;

public class binary_Search {

    public binary_Search() {

    }

    // USING RECURSION
    public static void isFound(int first, int last, int key, int[] array) {

        int avg = first + ((last - first) / 2);

        if (first > last) {
            System.out.println("Element is not found :(");
            return;

        } else {

            if (key > array[avg]) {

                first = avg + 1;
                isFound(first, last, key, array);
                return;

            } else if (key < array[avg]) {

                last = avg - 1;
                isFound(first, last, key, array);
                return;

            }
        }

        System.out.println("Element is found :) ");
    }

    // USING WHILE LOOP
    public static void check(int first, int last, int key, int[] array) {

        boolean x = false;
        while (!x) {

            if (first > last) {
                System.out.println("not found ");
                break;
            }

            int avg = first + ((last - first) / 2);

            if (key == array[avg]) {
                System.out.println("found ");
                break;
            }

            if (key > array[avg]) {

                first = avg + 1;
            }

            if (key < array[avg]) {

                last = avg - 1;
            }

        }

    }

}
