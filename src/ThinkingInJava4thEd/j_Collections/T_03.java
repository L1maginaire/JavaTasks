package ThinkingInJava4thEd.j_Collections;

// Modify innerclasses/Sequence.java so that you can add any number of elements to it.

import java.util.ArrayList;
import java.util.List;

public class T_03 {
}

class Word {
    private String word;

    public Word(String s) {
        word = s;
    }

    public String toString() {
        return word;
    }
}

class Sequence {
    private List<Word> items;

    public Sequence() {
        items = new ArrayList<>();
    }

    public void add(Word w) {
        items.add(w);
    }

    public Word getItem(int i) {
        return items.get(i);
    }

    public int amount() {
        return items.size();
    }

    public static void main(String[] args) {
        Word w1 = new Word("Word");
        Word w2 = new Word("Sentence");
        Word w3 = new Word("Book");
        Sequence message = new Sequence();
        message.add(w1);
        message.add(w2);
        message.add(w3);
        for (int i = 0; i < message.amount(); i++) {
            System.out.println(message.getItem(i));
        }
    }
}