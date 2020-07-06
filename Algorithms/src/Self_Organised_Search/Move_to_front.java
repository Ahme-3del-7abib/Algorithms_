package Self_Organised_Search;

/**
 *
 * @author Simplx
 */
class Move_to_front<T> extends LinkedList {

    @Override
    public void elenmentIsFound(Object element_) {

        Node i = head;

        T current_element = (T) i.value;

        int current_index = 1;

        while (i.next != null) {
            if ((T) element_ == current_element) {

                System.out.println("Element found ... ");
                super.add(current_element, 0);
                super.remove(current_index);
                return;

            } else {
                i = i.next;
                current_element = (T) i.value;
                current_index++;
            }
        }

        System.out.println("Element not found ... ");
        return;

    }
}
