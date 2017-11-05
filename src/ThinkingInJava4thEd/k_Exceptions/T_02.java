package ThinkingInJava4thEd.k_Exceptions;

// Define an object reference and initialize it to null. Try to call a method through this reference. Now wrap the code in a try-catch clause to catch the exception.

public class T_02 {
    public static void main(String[] args) {
        try {
            T_02 t = null;
            t.f();
        } catch (NullPointerException e) {
            System.out.println(e);
        }
    }

    void f() {
        System.out.println("smth");
    }
}
