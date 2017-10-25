package ThinkingInJava4thEd.i_Inner_classes;

// Implement reverseSelector() in Sequence.java

public class T_22 {}

class Word3 {
    private String word;

    public Word3(String s) {
        word = s;
    }

    public String toString() {
        return word;
    }
}

interface Selector3 {
    boolean end();

    Object current();

    void next();
}

class Sequence3 {
    private Object[] items;
    private int next = 0;
    private int last;

    public Sequence3(int size) {
        items = new Object[size];
        this.last = size-1;
    }

    public void add(Object x) {
        if (next < items.length)
            items[next++] = x;
    }

    private class ReverseSelector implements Selector3{
        private int i = last;
        @Override
        public boolean end() {
            return i == -1;
        }

        @Override
        public Object current() {
            return items[i];
        }

        @Override
        public void next() {
            if(i>=0) i--;
        }
    }

    private class SequenceSelector implements Selector3 {
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

    public Selector3 selector() {
        return new SequenceSelector();
    }
    public Selector3 reverseSelector() {return new ReverseSelector(); }

    public static void main(String[] args) {
        Word3 w1 = new Word3("Word");
        Word3 w2 = new Word3("Sentence");
        Word3 w3 = new Word3("Book");
        Sequence3 message = new Sequence3(3);
        message.add(w1);
        message.add(w2);
        message.add(w3);
        Selector3 sel = message.reverseSelector();
        while (!sel.end()) {
            System.out.print(sel.current() + " ");
            sel.next();
        }
    }
}