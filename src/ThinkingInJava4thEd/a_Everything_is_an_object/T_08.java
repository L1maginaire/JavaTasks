package ThinkingInJava4thEd.a_Everything_is_an_object;

// Write a program that demonstrates that, no matter how many objects you create of a particular class,
// there is only one instance of a particular static field of that class.

public class T_08 {
    static int x;
    public static void main(String[] args) {
        T_08 one = new T_08();
        T_08 two = new T_08();
        T_08 three = new T_08();
        System.out.println(one.x);
        System.out.println(two.x);
        System.out.println(three.x);
        two.x = 100;
        System.out.println(one.x);
        System.out.println(two.x);
        System.out.println(three.x);
    }
}
