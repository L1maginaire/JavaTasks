package ThinkingInJava4thEd.j_Collections;

// Using a Map<String,Integer>, follow the form of UniqueWords.java to create a program that counts the occurrence of words in a file. Sort the results using Collections.sort()
// with a second argument of String.CASE_INSENSITIVE_ORDER (to produce an alphabetic sort), and display the result.

import java.util.*;

public class T_20 {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(
                new TextFile("/home/guest/Документы/vocab", "\\s+"));
        List<String> replacement = new ArrayList<>();
        List<String> delete = new ArrayList<>();
        for (String s : words) {
            if (s.contains(",")) {
                replacement.add(s.substring(0, s.length() - 1));
                delete.add(s);
            } else if (s.contains("-")) {
                delete.add(s);
            }
        }
        words.removeAll(delete);
        words.addAll(replacement);
        System.out.println(words);
        Collections.sort(words, String.CASE_INSENSITIVE_ORDER);
        Map<String, Integer> wordCount = new LinkedHashMap<>();
        Iterator it = words.iterator();
        int total = 0;
        while (it.hasNext()) {
            String s = (String) it.next();
            if (words.contains(s)) {
                Integer count = wordCount.get(s);
                wordCount.put(s, count == null ? 1 : count + 1);
                total++;
            }
        }
        System.out.println(wordCount);
        System.out.println(total);
    }
}