package ThinkingInJava4thEd.a_Everything_is_an_object;

// Turn the Incrementable code fragments into a working program.

public class T_07 {
    public static void main(String[] args) {
        System.out.println("StaticTest.i= " + StaticTest.i);
        StaticTest st1 = new StaticTest();
        StaticTest st2 = new StaticTest();
        System.out.println("st1.i= " + st1.i);
        System.out.println("st2.i= " + st2.i);
        Incrementable sf = new Incrementable();
        sf.increment();
        System.out.println("st1.i = " + st1.i);
        System.out.println("st2.i = " + st2.i);
    }
}

class StaticTest {
    static int i = 47;
}

class Incrementable {
    static void increment() {
        StaticTest.i++;
    }
}