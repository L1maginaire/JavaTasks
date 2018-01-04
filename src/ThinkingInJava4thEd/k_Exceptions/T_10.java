package ThinkingInJava4thEd.k_Exceptions;

// Create a class with two methods, f() and g(). In g(), throw an exception of a new type that you define. In f(),
// call g(), catch its exception and, in the catch clause, throw a different exception (of a second type that you define).
// Test your code in main().

public class T_10 {
    void g() throws MySuperException {
        throw new MySuperException("foo");
    }

    void f() {
        try {
            g();
        } catch (MySuperException e) {
            e.printStackTrace();
            throw new UnsupportedOperationException();
        }
    }

    public static void main(String[] args) {
        new T_10().f();
    }
}
