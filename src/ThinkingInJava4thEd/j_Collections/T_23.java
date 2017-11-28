package ThinkingInJava4thEd.j_Collections;

import java.util.*;

public class T_23 {
    public static void main(String[] args) {
        Map<String, Integer> m =
                new LinkedHashMap<>();
        m.put("a", 1);
        m.put("b", 4);
        m.put("c", 8);
        m.put("d", 12);
        m.put("e", 6);
        m.put("f", 5);
        m.put("g", 466);
        Map<String, Integer> mTemp = new LinkedHashMap<>();
        Set<String> set = new TreeSet<>(m.keySet());
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            String s = it.next();
            Integer i = m.get(s);
            m.remove(s);
            mTemp.put(s, i);
        }
        Set<String> tempSet = new TreeSet<>(mTemp.keySet());
        Iterator<String> itssTemp = tempSet.iterator();
        while (itssTemp.hasNext()) {
            String s = itssTemp.next();
            Integer i = mTemp.get(s);
            mTemp.remove(s);
            m.put(s, i);
        }
        mTemp.clear();
        System.out.println(m);
    }
}
