package ThinkingInJava4thEd.f_Reusing_classes;

//p235
// Prove that class loading takes place only once. Prove that loading may be caused by either the creation of the first instance of the that
// class of by access of a static member.

public class T_23 {
    private static int xxx = x1("MC.init");
    static int x = 0;
    int y = 10;

    public T_23() {
        System.out.println("MC.Constructor()");
    }

    static int x1(String s) {
        System.out.println(s);
        return 0;
    }

    public static void main(String[] args) {
        T_23 t = new T_23();
        T_23 t1 = new T_23();
        T_23 t2 = new T_23();
        Y.main(args);
        X x2 = new X();
        Y y2 = new Y();
    }
}

class X {
    private static int xxx = x1("X.init");
    static int x = 100;
    int y = 1000;

    public X() {
        System.out.println("X.Constructor()");
    }

    static int x1(String s) {
        System.out.println(s);
        return 0;
    }
}

class Y extends X {
    static int x = 10_000;
    int y = 100_000;

    public Y() {
        System.out.println("Y.Constructor()");
    }

    public static void main(String[] args) {
        X xobj = new X();
        Y yobj = new Y();
    }
}