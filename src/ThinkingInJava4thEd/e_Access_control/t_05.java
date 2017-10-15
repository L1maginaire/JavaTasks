package ThinkingInJava4thEd.e_Access_control;

//Create a class with public, private, protected and package-access fields and method members. Create an object of this class and
// see what kind of compiler messages you get when you try to access all the class members. Be aware that classes in the same directory
// are part of the "default" package.

public class t_05 {
    public static void main(String[] args) {
        System.out.println(AccessTest.i);
        System.out.println(AccessTest.x);
        System.out.println(AccessTest.y);
//        System.out.println(AccessTest.z);
    }
}

class AccessTest {
    static int i;
    static public int x;
    static protected int y;
    static private int z;
}
