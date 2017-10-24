package ThinkingInJava4thEd.f_Reusing_classes;

// Modify Exercise 16 so that Frog overrides the method definitions from the base class (provides new definitions using the same method
// signatures). Note what happens in main().

public class T_17 {

}

class Amphibian2 {
    void f() {
        System.out.println("Amphibian.f()");
    }

    void g() {
        System.out.println("Amphibian.g()");
    }

    void h(Amphibian2 a) {
        System.out.println("Amphibian.h(): " + a);
        a.f();
    }

    @Override
    public String toString() {
        return "AMPHIBIAN";
    }
}

class Frog2 extends Amphibian2 {
    @Override
    void f() {
        System.out.println("Frog.f()");
    }

    @Override
    void g() {
        System.out.println("Frog.g()");
    }

    @Override
    void h(Amphibian2 a) {
        super.h(a);
        System.out.println("Frog.h()");
    }

    public static void main(String[] args) {
        Frog2 frog = new Frog2();
        frog.f();
        frog.g();
        frog.h(frog);
    }

    @Override
    public String toString() {
        return "FROG";
    }
}