package ThinkingInJava4thEd.f_Reusing_classes;

// Prove that base-class constructors are (a) always called and (b) called before derived-class constructors.

public class T_04 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        B.makeB();
    }
}

class A {
    public A() {
        System.out.println("A");
    }
}

class B extends A {
    public B() {
        System.out.println("B");
    }

    static B makeB() {
        return new B();
    }
}