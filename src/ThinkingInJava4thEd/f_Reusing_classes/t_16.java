package ThinkingInJava4thEd.f_Reusing_classes;

//p225
// Create a class called Amphibian. From this, inherit a class called Frog. Put appropriate methods in the base class. In main(), create a
// Frog and upcast it to Amphibian, and demonstrate that all the methods still work.

public class t_16 {
}

class Amphibian {
    void f() {
        System.out.println("Amphibian.f()");
    }

    void g() {
        System.out.println("Amphibian.g()");
    }

    void h(Amphibian a) {
        System.out.println("Amphibian.h(): " + a);
    }

    @Override
    public String toString() {
        return "AMPHIBIAN";
    }
}

class Frog extends Amphibian {
    public static void main(String[] args) {
        Frog frog = new Frog();
        frog.f();
        frog.g();
        frog.h(frog);
    }

    @Override
    public String toString() {
        return "FROG";
    }
}