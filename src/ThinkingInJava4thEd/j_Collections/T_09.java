package ThinkingInJava4thEd.j_Collections;

// Modify innerclasses/Sequence.java so that Sequence works with an Iterator instead of a Selector.

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class T_09 {
    public static void main(String[] args) {
        Word2 w1 = new Word2("Word");
        Word2 w2 = new Word2("Sentence");
        Word2 w3 = new Word2("Book");
        Sequence2 message = new Sequence2();
        message.add(w1);
        message.add(w2);
        message.add(w3);
        Iterator it = message.getList().iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
    }
}

class Word2 {
    private String word;

    public Word2(String s) {
        word = s;
    }

    public String toString() {
        return word;
    }
}

class Sequence2 {
    private List<Object> list;

    public Sequence2() {
        list = new ArrayList<>();
    }

    public void add(Object x) {
        list.add(x);
    }

    public List getList() {
        return list;
    }
}