package ThinkingInJava4thEd.k_Exceptions;

//Write a class with a method that throws an exception of the type created in Exercise 4. Try compiling it without an exception
// specification to see what the compiler says. Add the appropriate exception specification. Try out your class and its exception
// inside a try-catch clause.

public class T_08 {
    void f(String s) throws MySuperException {
        throw new MySuperException(s);
    }

    public static void main(String[] args) {
        try {
            new T_08().f("boo");
        } catch (MySuperException e) {
            e.printStackTrace();
        }
    }
}
