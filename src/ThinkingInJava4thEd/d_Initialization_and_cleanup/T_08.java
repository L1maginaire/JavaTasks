package ThinkingInJava4thEd.d_Initialization_and_cleanup;

// Create a class with two methods. Within the first method, call the second method twice: the first time without using this, and the second time
// using this - just to see it working; you should not use this form in practice.

public class T_08 {
    void f() {
        System.out.println("f()");
    }

    void g() {
        System.out.println("g()");
        f();
        this.f();
    }

    public static void main(String[] args) {
        T_08 t = new T_08();
        t.g();
    }
}
