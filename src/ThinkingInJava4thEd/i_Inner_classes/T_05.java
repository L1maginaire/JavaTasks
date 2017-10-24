package ThinkingInJava4thEd.i_Inner_classes;

// Create a class with an inner class. In a separate class, make an instance of the inner class.

public class T_05 {
    public static void main(String[] args) {
        A a = new A();
        A.B b = a.new B();
    }
}

class A{class B{}}