package ThinkingInJava4thEd.j_Collections;

// Modify the previous exercise so that it uses a class containing a String and a count field to store each different word, and a Set of these objects to maintain the list of words.

import java.util.*;

public class T_21 {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(new TextFile("/home/guest/Документы/vocab", "\\s+"));
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
        Collections.sort(words, String.CASE_INSENSITIVE_ORDER);
        Set<MyWord> wordObjects = new HashSet<>();
        Iterator it = words.iterator();
        while (it.hasNext()) {
            String s = (String) it.next();
            int count = 0;
            for (int i = 0; i < words.size(); i++) {
                if (s.equals(words.get(i))) count++;
            }
            MyWord w = new MyWord(s, count);
            wordObjects.add(w);
        }
        System.out.println("Word count: " + wordObjects);
        System.out.println("Total words: " + MyWord.total);
    }
}

class MyWord {
    static int total = 0;
    String s;
    int count;

    MyWord(String s, int count) {
        this.s = s;
        this.count = count;
        total++;
    }

    public String toString() {
        return s + ": " + count;
    }
}