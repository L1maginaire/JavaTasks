package ThinkingInJava4thEd.i_Inner_classes;

//p301
// Repeat Exercise 7 using an anonymous inner class.

public class T_12 {
    public static void main(String[] args) {
        Outer5 o = new Outer5();
        o.getI();
        o.inner().f();
        o.getI();
    }
}

class Outer5 {
    private int i = 1;

    private void g() {
        System.out.println("g()");
    }

    public Inner inner() {
        return new Inner() {
            public void f() {
                i = 100;
                System.out.println(i);
                g();
            }
        };
    }

    public void getI() {
        System.out.println(i);
    }
}

interface Inner {
    void f();
}