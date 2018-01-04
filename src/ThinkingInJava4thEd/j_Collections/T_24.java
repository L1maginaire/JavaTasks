package ThinkingInJava4thEd.j_Collections;

// Create a Map<String, ArrayList<Integer>>. Use net.mindview.TextFile to open a text file and read
// it in a word at a time (use "\\W+\" as the second argument to the TextFile constructor). Count
// the words as you read them in, and for each word in the file, record in the ArrayList<Integer>
// the word count associated with that word - that is, in effect, the location in the file where that
// word was found.

import java.util.*;

public class T_24 {
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
        System.out.println("Map of word locations: " + m);
    }
}
