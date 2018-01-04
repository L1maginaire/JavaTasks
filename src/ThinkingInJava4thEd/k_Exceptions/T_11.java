package ThinkingInJava4thEd.k_Exceptions;

// Repeat the previous exercise, but inside the catch clause, wrap g()'s exception in a RuntimeException.

public class T_11 {
    static void f() {
        try {
            g();
        } catch(MySuperException ge) {
            ge.printStackTrace();
            throw new RuntimeException(ge);
        }
    }
    static void g() throws MySuperException {
        throw new MySuperException("boo");
    }
    public static void main(String[] args) {
        f();
    }
}


