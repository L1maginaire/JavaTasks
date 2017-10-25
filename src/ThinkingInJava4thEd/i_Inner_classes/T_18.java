package ThinkingInJava4thEd.i_Inner_classes;

//p304
// Create a class containing a nested class. In main(), create an instance of the nested class.

public class T_18 {
    static class Nested{
        static int x = 500;
    }

    public static void main(String[] args) {
        Nested n = new Nested();
        System.out.println(n.x);
    }
}
