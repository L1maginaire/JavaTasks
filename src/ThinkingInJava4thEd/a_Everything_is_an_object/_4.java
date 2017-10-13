package ThinkingInJava4thEd.a_Everything_is_an_object;

// Turn the DataOnly code fragments into a program that compiles and runs

public class _4 {
    public static void main(String[] args) {
        DataOnly d = new DataOnly();
        d.i = 1;
        d.d = 1.01;
        d.b = false;
        d.show();
    }
}

class DataOnly {
    int i;
    double d;
    boolean b;

    void show() {
        System.out.println(i);
        System.out.println(d);
        System.out.println(b);
    }
}