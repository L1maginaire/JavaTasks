package ThinkingInJava4thEd.j_Collections;

// Fill a HashMap with key-value pairs. Print the results to show ordering by hash code. Extract the pairs, sort by key, and place the result
// into a LinkedHashMap. Show that the insertion order is maintained.

import java.util.*;

public class T_17 {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("a", 44);
        hashMap.put("c", 12);
        hashMap.put("b", 52);
        hashMap.put("d", 6);
        System.out.println(hashMap);
        Set<String> set = new TreeSet<>(hashMap.keySet());
        System.out.println(set);
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        for (String s : set) {
            linkedHashMap.put(s, hashMap.get(s));
        }
        System.out.println(linkedHashMap);
    }
}
