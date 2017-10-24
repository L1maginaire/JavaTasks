package ThinkingInJava4thEd.h_Interfaces;

// Create an abstract class with no methods. Derive a class and add a method. Create a static method that takes a reference to the base
// class, downcasts it to the derived class, and calls the method. In main(), demonstrate that it works. Now put the abstract declaration
// for the method in the base class, thus eliminating the need for the downcast.

public class t_04 {
    public static void main(String[] args) {
        B2 b = new B2();
        b.f();
        C2 c2 = new D2();
        c2.f();
    }
}

abstract class A2 {
}

class B2 extends A2 {
    void f() {
        System.out.println("B2.f()");
    }

    static void g(A2 a2obj) {
        B2 b2 = (B2) a2obj;
        b2.f();
    }
}

abstract class C2 {
    abstract void f();
}

class D2 extends C2 {
    @Override
    void f() {
        System.out.println("D2.f()");
    }

    static void g(C2 c2obj) {
        c2obj.f();
    }
}