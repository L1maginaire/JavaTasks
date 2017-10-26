package ThinkingInJava4thEd.j_Collections;

//p340
// Create and populate a List<Integer>. Create a second List<Integer> of the same size as the first, and use ListIterator to read elements of the first List and insert
// them into the second in reverse order. (You may want to explore a number of different ways to solve this problem.)

import java.util.*;

public class T_12 {
    public static void main(String[] args) {
        System.out.println(otherM0());
        System.out.println(otherM1());
        System.out.println(otherM2());
        System.out.println(otherM3());
    }

    static Collection<Integer> otherM0() {
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 2, 3);
        List<Integer> list2 = new ArrayList<>();
        Collections.addAll(list2, 4, 5, 6);
        ListIterator li = list.listIterator();
        int x = list.size() - 1;
        for (int i = 0; i < list.size(); i++) {
            while (li.hasNext()) {
                list2.set(x--, (Integer) li.next());
            }
        }
        return list2;
    }

    static Collection<Integer> otherM1() {
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 2, 3);
        List<Integer> list2 = new ArrayList<>();
        Collections.addAll(list2, 4, 5, 6);
        ListIterator li = list.listIterator();
        for (int i = list.size() - 1; i >= 0; i--) {
            list2.set(i, (Integer) li.next());
        }
        return list2;
    }

    static Collection<Integer> otherM2() {
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 2, 3);
        List<Integer> list2 = new ArrayList<>();
        Collections.addAll(list2, 4, 5, 6);
        ListIterator li = list.listIterator(list.size());
        int x = 0;
        while (li.hasPrevious()) {
            list2.set(x++, (Integer) li.previous());
        }
        return list2;
    }

    static Collection<Integer> otherM3() {
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 2, 3);
        List<Integer> list2 = new ArrayList<>();
        Collections.addAll(list2, 4, 5, 6);
        List<Integer> sub = new ArrayList<>(list);
        Collections.reverse(sub);
        list2 = sub;
        return list2;
    }
}