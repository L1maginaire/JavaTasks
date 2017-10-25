package ThinkingInJava4thEd.i_Inner_classes;

//p292
// Create a class that holds a String, and has a toString() method that displays this String. Add several instances of your new class to a  Sequence3 ojbect, then display them.

public class T_02 {
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

interface Selector {
    boolean end();

    Object current();

    void next();
}

class Sequence {
    private Object[] items;
    private int next = 0;

    public Sequence(int size) {
        items = new Object[size];
    }

    public void add(Object x) {
        if (next < items.length)
            items[next++] = x;
    }

    private class SequenceSelector implements Selector {
        private int i = 0;

        public boolean end() {
            return i == items.length;
        }

        public Object current() {
            return items[i];
        }

        public void next() {
            if (i < items.length) i++;
        }
    }

    public Selector selector() {
        return new SequenceSelector();
    }

    public static void main(String[] args) {
        Word w1 = new Word("Word");
        Word w2 = new Word("Sentence");
        Word w3 = new Word("Book");
        Sequence message = new Sequence(3);
        message.add(w1);
        message.add(w2);
        message.add(w3);
        Selector sel = message.selector();
        while (!sel.end()) {
            System.out.print(sel.current() + " ");
            sel.next();
        }
    }
}