package ThinkingInJava4thEd.j_Collections;

// Write a method that uses an Iterator to step through a Collection and print the toString() of each object in the container. Fill all the different types of Collections
// with objects and apply your method to each container.

import java.util.*;

public class T_11 {
    static void f(Collection c) {
        Iterator i = c.iterator();
        while (i.hasNext()) {
            System.out.print(i.next() + " ");
        }
    }

    public static void main(String[] args) {
        Collection<String> c;
        c = new ArrayList<>();
        Collections.addAll(c, "a", "b", "c");
        f(c);
        System.out.println("");
        c = new LinkedList<>();
        Collections.addAll(c, "a", "b", "c");
        f(c);
        System.out.println("");
        c = new HashSet<>();
        Collections.addAll(c, "a", "b", "c");
        f(c);
        System.out.println("");
        c = new TreeSet<>();
        Collections.addAll(c, "a", "b", "c");
        f(c);
    }
}
