package ThinkingInJava4thEd.i_Inner_classes;

// Modify Exercise 1 so that Outer has a private String field (initialized by the constructor), and Inner has a toString() that displays this field. Create an object of
// type Inner and display it.

public class T_03 {}

class Outer2 {
    private String s;

    public Outer2(String s) {
        this.s = s;
        System.out.println("Outer");
    }

    public Inner2 f() {
        return new Inner2();
    }

    class Inner2 {
        @Override
        public String toString() {
            return s;
        }

        public Inner2() {
            System.out.println("Inner");
        }
    }

    public static void main(String[] args) {
        Outer2 o = new Outer2("sample_text");
        Inner2 i = o.f();
        System.out.println(i);
    }
}