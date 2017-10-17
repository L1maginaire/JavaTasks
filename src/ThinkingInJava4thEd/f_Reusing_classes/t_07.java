package ThinkingInJava4thEd.f_Reusing_classes;

// Modify Exercise 5 so that A and B have constructors with arguments instead of default constructors. Write a constructor for C and perform all
// initialization within C's constructor.

public class t_07 {

}

class A3 {
    public A3(int x) {
        System.out.println("A2 {" + x + "}");
    }
}

class B3 extends A3 {
    public B3(int x) {
        super(x);
        System.out.println("B2 {" + x + "}");
    }
}

class C3 extends B3 {
    public C3() {
        super(100);
        System.out.println("C3");
    }

    public static void main(String[] args) {
        B3 b = new B3(0);
        C3 c = new C3();
    }
}