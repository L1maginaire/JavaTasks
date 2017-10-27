package ThinkingInJava4thEd.j_Collections;

//p349
// Take the Gerbil class in Exercise 1 and put it into a Map instead, associating each Gerbil's name (e.g. "Fuzzy" or "Spot") as a String (the
// key) for each Gerbil (the value) you put in the table. Get an Iterator for the keySet() and use it to move through the Map, looking up the
// Gerbil for each key and printing out the key and telling the Gerbil to hop().

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class T_16 {
    public static void main(String[] args) {
        Map<Integer, Gerbil2> map = new TreeMap<>();
        Gerbil2 g0 = new Gerbil2(0);
        Gerbil2 g1 = new Gerbil2(1);
        Gerbil2 g2 = new Gerbil2(2);
        Gerbil2 g3 = new Gerbil2(3);
        map.put(g0.num, g0);
        map.put(g1.num, g1);
        map.put(g2.num, g2);
        map.put(g3.num, g3);
        Iterator i = map.keySet().iterator();
        while (i.hasNext()) {
            int in = (Integer) i.next();
            System.out.println("" + in);
            map.get(in).hop();
        }
    }
}
