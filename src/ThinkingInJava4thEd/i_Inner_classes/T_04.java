package ThinkingInJava4thEd.i_Inner_classes;

//p293
// Add a method to the class Sequence.SequenceSelector that produces the reference to the outer class Sequence.

public class T_04 {}

class Sequence2 {
    private Object[] items;
    private int next = 0;

    public Sequence2(int size) {
        items = new Object[size];
    }

    public void add(Object x) {
        if (next < items.length)
            items[next++] = x;
    }

    private class SequenceSelector implements Selector {
        private int i = 0;

        public Sequence2 getRef(){
            return Sequence2.this;
        }
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
}