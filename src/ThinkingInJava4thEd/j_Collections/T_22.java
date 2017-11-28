package ThinkingInJava4thEd.j_Collections;

// Starting with Statistics.java, create a program that runs the test repeatedly and looks to see if any one number tends to appear more than the others in the results.

import java.util.*;

public class T_22 {
    private static int statistics(int n) {
        Random rand = new Random();
        Map<Integer, Integer> m = new TreeMap<>();
        for (int i = 0; i < 10000; i++) {
            int r = rand.nextInt(20);
            Integer freq = m.get(r);
            m.put(r, freq == null ? 1 : freq + 1);
        }
        int max = 0;
        for (int i = 0; i < m.keySet().size(); i++) {
            max = max < m.get(i) ? m.get(i) : max;
        }
        Set<Map.Entry<Integer, Integer>> me = new
                LinkedHashSet<>(m.entrySet());
        int maxKey = 0;
        Iterator<Map.Entry<Integer, Integer>> it = me.iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, Integer> findMax = it.next();
            if (findMax.getValue() == max)
                maxKey = findMax.getKey();
        }
        return maxKey;
    }

    public static void main(String[] args) {
        Map<Integer, Integer> m20 =
                new TreeMap<>();
        for (int i = 0; i < 10000; i++) {
            int x = statistics(10000);
            Integer freq = m20.get(x);
            m20.put(x, freq == null ? 1 : freq + 1);
        }
        System.out.println(m20);
    }
}