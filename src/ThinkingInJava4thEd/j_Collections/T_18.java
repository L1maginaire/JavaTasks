package ThinkingInJava4thEd.j_Collections;

// Repeat the previous exercise with a HashSet and a LinkedHashSet.

import java.util.*;

public class T_18 {
    public static void main(String[] args) {
        Map<String, Gerbil> gerbils = new HashMap<>();
        gerbils.put("a", new Gerbil(0));
        gerbils.put("b", new Gerbil(1));
        gerbils.put("c", new Gerbil(2));
        gerbils.put("d", new Gerbil(3));
        System.out.println(gerbils);
        System.out.println();
        Set<String> hashedKeys =
                new HashSet<>(gerbils.keySet());
        System.out.println("HashSet: " + hashedKeys);
        Map<String, Gerbil> hashedGerbils =
                new LinkedHashMap<>();
        for (String s : hashedKeys) {
            hashedGerbils.put(s, gerbils.get(s));
        }
        System.out.println();
        System.out.println("HashSet: " + hashedGerbils);
        System.out.println();
        Set<String> linkedHashedKeys =
                new LinkedHashSet<>(gerbils.keySet());
        System.out.println("LinkedHashSet: " + linkedHashedKeys);
        System.out.println();
        Map<String, Gerbil> linkedHashedGerbils =
                new LinkedHashMap<>();
        for (String s : linkedHashedKeys) {
            linkedHashedGerbils.put(s, gerbils.get(s));
        }
        System.out.println("LinkedHashSet: " + linkedHashedGerbils);
    }
}
