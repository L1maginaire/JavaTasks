package ThinkingInJava4thEd.d_Initialization_and_cleanup;

// Modify the previous exercise so that two of the overloaded methods have two arguments (of two different types), but in reverse order
// to each other. Verify that this works.

public class t_06 {
    public static void main(String[] args) {
        Dog2 d = new Dog2();
        d.bark("", 1);
        d.bark(1, "");
    }
}

class Dog2 {

    void bark(String s, int i) {
        System.out.println("woof");
    }

    void bark(int i, String s) {
        System.out.println("bark");
    }

}