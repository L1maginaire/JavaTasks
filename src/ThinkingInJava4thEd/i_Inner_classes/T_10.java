package ThinkingInJava4thEd.i_Inner_classes;

// Repeat the previous exercise but define the inner class within a scope with scope within a method.

public class T_10 {
    A2 g(boolean b) {
        if (b) {
            class B2 implements A2 {
                @Override
                public void f() {
                    System.out.println("vamp()");
                }
            }
            return new B2();
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        T_10 t = new T_10();
        t.g(true).f();
    }
}
