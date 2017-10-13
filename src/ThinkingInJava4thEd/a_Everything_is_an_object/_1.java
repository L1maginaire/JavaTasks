package ThinkingInJava4thEd.a_Everything_is_an_object;

//p93

// Create a class containing an int and a char that are not intitialized and print their
// values to verify that Java performs default initialization.

public class _1 {
    static int x;
    static char y;

    public static void main(String[] args) {
        System.out.println("x: " + x + ", " + "y: " + y);
    }
}
