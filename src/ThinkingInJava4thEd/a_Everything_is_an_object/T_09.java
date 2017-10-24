package ThinkingInJava4thEd.a_Everything_is_an_object;

// Write a program that demonstrates that autoboxing works for all the primitive // types and their wrappers.

public class T_09 {
    public static void main(String[] args) {
        boolean b = false;
        char c = 'Q';
        byte t = 127;
        short s = 32767;
        int i = 1_000;
        long l = 1_000l;
        float f = 0.01f;
        double d = 0.01d;
        System.out.println(b);
        System.out.println(c);
        System.out.println(t);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
    }
}
