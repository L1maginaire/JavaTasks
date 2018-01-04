package ThinkingInJava4thEd.j_Collections;

// Take the resulting Map from the previous exercise and re-create the order of the words as they appeared
// in the original file.

import java.util.*;

public class T_25 {
    public static void main(String[] args) {
        Map<String,ArrayList<Integer>> m =
                new LinkedHashMap<>();
        List<String> words = new LinkedList<>();
        words.addAll(new TextFile("TextFile.txt", "\\W+"));
        System.out.println("Words in file: " + words);
        Iterator itWords = words.iterator();
        int count = 0;
        while(itWords.hasNext()) {
            String s = (String)itWords.next();
            count++;
            if(!m.keySet().contains(s)) {
                ArrayList<Integer> ai =
                        new ArrayList<>();
                ai.add(0, count);
                m.put(s, ai);
            }
            else {
                m.get(s).add(count);
                m.put(s, m.get(s));
            }
        }
        System.out.println();
        System.out.println("Map of word locations: " + m);
        Map<Integer,String> replay = new TreeMap<>();
        Iterator<Map.Entry<String,ArrayList<Integer>>> it =
                m.entrySet().iterator();
        while(it.hasNext()) {
            Map.Entry<String,ArrayList<Integer>> me = it.next();
            for(int i = 0; i < me.getValue().size(); i++)
                replay.put(me.getValue().get(i),
                        me.getKey());
        }
        System.out.println();
        System.out.println("TreeMap of ordered locations, words: " + replay);
        System.out.println();
        System.out.println("Words in original order: " +
                replay.values());
    }
}