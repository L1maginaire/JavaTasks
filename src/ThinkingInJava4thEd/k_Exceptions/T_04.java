package ThinkingInJava4thEd.k_Exceptions;

// Create your own exception class using the extends keyword. Write a constructor for this class that takes a String argument and stores it inside the object with a String
// reference. Write a method that displays the stored String. Create a try-catch clause to exercise your new exception.

public class T_04 {
    public static void main(String[] args) {
        try {
            new T_04().f();
        } catch (MySuperException e) {
            e.print();
        }
    }

    void f() throws MySuperException {
        System.out.println("f()");
        throw new MySuperException("Hi from f()!");
    }
}

class MySuperException extends Exception {
    String s;

    public MySuperException(String s) {
        this.s = s;
    }

    void print() {
        System.out.println(s);
    }
}