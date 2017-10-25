package ThinkingInJava4thEd.i_Inner_classes;

//p290
// Write a class named Outer that contains an inner class named Inner.  Add a method to Outer that returns an object of type Inner. In main(),
// create and initialize a reference to an Inner.

public class T_01 {}

class Outer {
    public Outer() {
        System.out.println("Outer");
    }

    public Inner f() {
        return new Inner();
    }

    class Inner {
        public Inner() {
            System.out.println("Inner");
        }
    }

    public static void main(String[] args) {
        Outer o = new Outer();
        Inner i = o.f();
    }
}