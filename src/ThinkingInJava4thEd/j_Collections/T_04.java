package ThinkingInJava4thEd.j_Collections;

//p332
// Create a generator class that produces operation systems names(as String objects) each time you call next(), and loops around to the beginning of the character list when
// it runs out of names. Use this generator to fill an array, an ArrayList, a LinkedList, a HashSet, a LinkedHashSet, and a TreeSet, then print each container.

import java.util.*;

public class T_04 {
    static Collection<String> c;

    public static void main(String[] args) {
        Generator g = new Generator();
        c = new ArrayList<>();
        printList((List<String>) g.fill(c, 2));
        System.out.println("");
        c = new LinkedList<>();
        printList((List<String>) g.fill(c, 2));
        System.out.println("");
        c = new HashSet<>();
        printSet((HashSet<String>) g.fill(c, 2));
        System.out.println("");
        c = new LinkedHashSet<String>();
        printSet((HashSet<String>) g.fill(c, 2));
    }

    static void printSet(Set s) {
        Iterator<String> it = s.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    static void printList(List<String> l) {
        for (int i = 0; i < l.size(); i++) {
            System.out.println(l.get(i));
        }
    }
}


class Generator {
    int key = 0;

    public String next() {
        switch (key) {
            case 0:
                key++;
                return "Linux";
            case 1:
                key++;
                return "Windows";
            case 2:
                key++;
                return "OS_X";
            case 3:
                key = 0;
                return "Solaris";
            default:
                throw new IllegalArgumentException();
        }
    }

    public Collection fill(Collection<String> c, int amount) {
        for (int i = 0; i < amount; i++) {
            c.add(next());
        }
        return c;
    }
}