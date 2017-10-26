package ThinkingInJava4thEd.j_Collections;

// Modify ListFeatures.java so that it uses Integers (remember autoboxing!) instead of Pets, and explain any difference in results.

import java.util.*;

public class T_05 {
    public static void main(String[] args) {
        Random rand = new Random(47);
        List<Integer> integers = new ArrayList<>();
        System.out.println("1: " + integers);
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        System.out.println("2: " + integers);
        System.out.println("3: " + integers.contains(1));
        integers.remove(2);
        Integer i = integers.get(2);
        System.out.println("4: " + i + " " + integers.indexOf(i));
        Integer x = 55;
        System.out.println("5: " + integers.indexOf(x));
        System.out.println("6: " + integers.remove(x));
        System.out.println("7: " + integers.remove(i));
        System.out.println("8: " + integers);
        integers.add(1, 2);
        integers.add(2, 3);
        integers.add(3, 4);
        integers.add(4, 5);
        integers.add(4, 6);
        System.out.println("9: " + integers);
        List<Integer> sub = integers.subList(1, 4);
        System.out.println("Partically: " + sub);
        System.out.println("10: " + integers.containsAll(sub));
        System.out.println(sub);
        Collections.sort(sub);
        System.out.println("After sort(): " + sub);
        //for containtsAll order is not preferred:
        System.out.println("11: " + integers.containsAll(sub));
        Collections.shuffle(sub, rand);
        System.out.println("After shuffle(): " + sub);
        List<Integer> copy = new ArrayList<>(integers);
        System.out.println(integers + "");
        sub = Arrays.asList(integers.get(1), integers.get(4));
        System.out.println("sub: " + sub);
        copy.retainAll(sub);
        System.out.println("13: " + copy);
        copy = new ArrayList<>(integers);
        copy.remove(2);
        System.out.println("14: " + copy);
        copy.removeAll(sub);
        System.out.println("15: " + copy);
        copy.set(1, 55);
        System.out.println("16: " + copy);
        copy.addAll(2, sub);
        System.out.println("17: " + copy);
        System.out.println("18: " + integers.isEmpty());
        integers.clear();
        System.out.println("19: " + integers);
        System.out.println("20: " + integers.isEmpty());
        integers.add(0, 1);
        integers.add(1, 2);
        integers.add(2, 3);
        integers.add(3, 4);
        Object[] o = integers.toArray();
        System.out.println("22: " + o[3]);
    }
}
