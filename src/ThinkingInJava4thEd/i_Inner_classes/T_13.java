package ThinkingInJava4thEd.i_Inner_classes;

// Repeat Exercise 9 using an anonymous inner class.

public class T_13 {
    A4 g() {
        return new A4() {
            @Override
            public void f() {
                System.out.println("vamp()");
            }
        };
    }

    public static void main(String[] args) {
        T_13 t =    new T_13();
        t.g().f();
    }
}

interface A4{
    void f();
}