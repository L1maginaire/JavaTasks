package ThinkingInJava4thEd.a_Everything_is_an_object;

// Find the code fragments involving ATypeName and turn them into a program that compiles and runs.

public class _03 {
    public static void main(String[] args) {
        ATypeName a = new ATypeName();
        a.show();
    }
}

class ATypeName {
    int i;
    double d;
    boolean b;

    void show() {
        System.out.println(i);
        System.out.println(d);
        System.out.println(b);
    }
}