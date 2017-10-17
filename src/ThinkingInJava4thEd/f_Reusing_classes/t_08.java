package ThinkingInJava4thEd.f_Reusing_classes;

// Create a base class with only a non-default constructor, and a derived class with both a default (no-arg) and non-default constructor. In
// the derived-class constructors, call the base-class constructor.

public class t_08 extends A4 {
    public t_08() {
        this(100);
        System.out.println("nullargs");
    }

    public t_08(int x) {
        super();
        System.out.println("{" + x + "}");
    }

    public static void main(String[] args) {
        t_08 t = new t_08();
    }
}

class A4 {
    public A4() {
        System.out.println("A4");
    }
}