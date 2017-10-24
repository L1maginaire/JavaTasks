package ThinkingInJava4thEd.d_Initialization_and_cleanup;

// Create a class with a default constructor (one that takes no arguments) that prints a message. Create an object of this class.

public class T_05 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();
        d.bark(new Character('a'));
        d.bark(Byte.MIN_VALUE);
        d.bark(Short.MAX_VALUE);
        d.bark(1);
        d.bark(1L);
        d.bark(1.0f);
        d.bark(1.0d);
    }
}

class Dog {
    void bark() {
        System.out.println("wow");
    }

    void bark(char c) {
        System.out.println("woof");
    }

    void bark(byte b) {
        System.out.println("bark");
    }

    void bark(short s) {
        System.out.println("slurp");
    }

    void bark(int i) {
        System.out.println("howl");
    }

    void bark(long L) {
        System.out.println("rrr");
    }

    void bark(float f) {
        System.out.println("blabla");
    }

    void bark(double d) {
        System.out.println("dodo");
    }
}