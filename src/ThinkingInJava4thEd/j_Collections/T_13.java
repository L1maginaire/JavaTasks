package ThinkingInJava4thEd.j_Collections;

//p341
// Create an empty LlinkedList<Integer>. Using a ListIterator, add Integers to the list by always inserting them in the middle of the list.

import java.util.LinkedList;

public class T_13 {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        for (int i = 0; i < 100; i++) {
            ll.add(ll.size() / 2, i);
        }
        System.out.println(ll);
    }
}
