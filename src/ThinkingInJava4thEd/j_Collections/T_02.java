package ThinkingInJava4thEd.j_Collections;

//p328
// Modify SimpleCollection.java to use a Set for c.

import java.util.Collection;
import java.util.HashSet;

public class T_02 {
    public static void main(String[] args) {
        Collection<Integer> c = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            c.add(i);
        }
        for (Integer i : c) {
            System.out.println(i);
        }
    }
}