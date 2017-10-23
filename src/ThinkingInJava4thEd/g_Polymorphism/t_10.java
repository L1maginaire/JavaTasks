package ThinkingInJava4thEd.g_Polymorphism;

// Create a base class with two methods. In the first method, call the second method. Inherit a class and override the second method. Create an object of the derived class,
// upcast it to the base type, and call the first method. Explain what happens.

public class t_10 {
    public static void main(String[] args) {
        B b = new B();
        b.f();
        A a = b;
        a.f();
    }
}

class A {
    void f() {
        System.out.println("A.f()");
        g();
    }

    void g() {
        System.out.println("A.g()");
    }
}

class B extends A {
    @Override
    void g() {
        System.out.println("B.g()");
    }
}